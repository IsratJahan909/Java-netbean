package com.abc.student_crud.controller;

import com.abc.student_crud.entity.Student;
import com.abc.student_crud.service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@WebServlet("/student")
public class studentServlet extends HttpServlet {

    private StudentService studentService;

    @Override
    public void init() {
        
        studentService = new StudentService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        try {
            if ("edit".equals(action)) {
                int id = Integer.parseInt(request.getParameter("id"));
                Student student = studentService.readById(id);
                request.setAttribute("student", student);
                request.getRequestDispatcher("edit.jsp").forward(request, response);

            } else if ("delete".equals(action)) {
                int id = Integer.parseInt(request.getParameter("id"));
                studentService.delete(id); 
                response.sendRedirect("student?action=list");

            } else {
               
                List<Student> students = studentService.readAll(); 
                request.setAttribute("students", students);
                request.getRequestDispatcher("list.jsp").forward(request, response);
            }

        } catch (SQLException e) {
            throw new ServletException("Database error", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        try {
            if ("create".equals(action)) {
                Student student = buildStudentFromRequest(request);
                studentService.create(student);
            } else if ("update".equals(action)) {
                Student student = buildStudentFromRequest(request);
                student.setId(Integer.parseInt(request.getParameter("id")));
                studentService.update(student);
            }

            response.sendRedirect("student?action=list");

        } catch (SQLException e) {
            throw new ServletException("Database error", e);
        }
    }

    private Student buildStudentFromRequest(HttpServletRequest request) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String description = request.getParameter("description");
        LocalDate dob = LocalDate.parse(request.getParameter("dateOfBirth"));
        return new Student(0, name, email, description, dob, LocalDateTime.now());
    }
}
