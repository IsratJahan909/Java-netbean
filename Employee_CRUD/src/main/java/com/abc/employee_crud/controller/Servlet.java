
package com.abc.employee_crud.controller;



import com.abc.employee_crud.entity.Employee;
import com.abc.employee_crud.service.EmployeeService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

@WebServlet("/Employees")
public class Servlet extends HttpServlet {

    private EmployeeService service;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        service = new EmployeeService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF‑8");
        String action = request.getParameter("action");

        if ("create".equals(action)) {
            String name = request.getParameter("name");
            String dobStr = request.getParameter("dob");
            String department = request.getParameter("department");

            try {
                LocalDate dob = LocalDate.parse(dobStr);
                Employee emp = new Employee(name, dob, department);
                service.addEmployee(emp);
                response.sendRedirect(request.getContextPath() + "/Employees");
            } catch (DateTimeParseException e) {
                request.setAttribute("errorMessage", "Invalid date format for DOB");
                request.getRequestDispatcher("/views/form.jsp").forward(request, response);
            }

        } else if ("update".equals(action)) {
            String idStr = request.getParameter("id");
            String name = request.getParameter("name");
            String dobStr = request.getParameter("dob");
            String department = request.getParameter("department");

            try {
                Long id = Long.valueOf(idStr);
                LocalDate dob = LocalDate.parse(dobStr);
                Employee emp = new Employee(id, name, dob, department);
                service.updateEmployee(emp);
                response.sendRedirect(request.getContextPath() + "/Employees");
            } catch (NumberFormatException | DateTimeParseException e) {
                request.setAttribute("errorMessage", "Invalid input for ID or DOB");
                request.getRequestDispatcher("/views/form.jsp").forward(request, response);
            }
        } else {
            // default redirect
            response.sendRedirect(request.getContextPath() + "/Employees");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "add":
                request.getRequestDispatcher("/views/form.jsp").forward(request, response);
                break;

            case "edit":
                String idStr = request.getParameter("id");
                try {
                    Long id = Long.valueOf(idStr);
                    Employee existing = service.getEmployeeById(id);
                    request.setAttribute("employee", existing);
                    request.getRequestDispatcher("/views/form.jsp").forward(request, response);
                } catch (NumberFormatException e) {
                    response.sendRedirect(request.getContextPath() + "/Employees");
                }
                break;
}
}
}
