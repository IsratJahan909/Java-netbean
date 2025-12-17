package com.abc.jsp_crud.controller;

import com.abc.jsp_crud.entity.Department;
import com.abc.jsp_crud.entity.Emp;
import com.abc.jsp_crud.service.DepartmentService;
import jakarta.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/department")
public class DepartmentServlet extends HttpServlet {

    DepartmentService depService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        depService = new DepartmentService();
        System.out.println("DepartmentService initialized successfully");
//          depSer.save(new Department("JAVA", "IsDB BISEW"));
        System.out.println("Data saved-----" + depService.getAll());

        depService.save(new Department("JAVA", "IsDB BISEW"));
        System.out.println("Object Created----------");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String val = req.getParameter("action");
        if (val == null) {
            val = "list";
        }
        System.out.println("---------------------val------------------------" + val);

        switch (val) {
            case "add":
                req.getRequestDispatcher("/views/depForm.jsp").forward(req, resp);
                break;

            case "delete":
                String delId = req.getParameter("id");
                if (delId != null) {
                    depService.deleteById(Long.valueOf(delId));
                }
                resp.sendRedirect(req.getContextPath() + "/employees");
                break;
            default:
                List<Department> depList = new ArrayList<>();
                depList = depService.getAll();
                req.setAttribute("departments", depList);
                req.getRequestDispatcher("/views/deptlist.jsp").forward(req, resp);
        }
    }
}
