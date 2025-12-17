//package com.abc.jsp_crud.controller;
//
//import com.abc.jsp_crud.entity.Emp;
//import com.abc.jsp_crud.service.EmpService;
//import jakarta.servlet.ServletConfig;
//import java.io.IOException;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.math.BigDecimal;
//import java.util.List;
//
//@WebServlet("/employees")
//public class EmpServlet extends HttpServlet {
//    private EmpService dao;
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        dao = new EmpService();
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//
//        req.setCharacterEncoding("UTF-8");
//        String action = req.getParameter("action");
//
//        if ("create".equals(action)) {
//            // Fetch form fields
//            String name = req.getParameter("name");
//            String ageStr = req.getParameter("age");
//            String dobStr = req.getParameter("dob");
//            String salaryStr = req.getParameter("salary");
//            String address = req.getParameter("address");
//
//            // Convert values
//            Integer age = (ageStr != null && !ageStr.isBlank()) ? Integer.valueOf(ageStr) : null;
//            LocalDate dob = (dobStr != null && !dobStr.isBlank())
//                    ? LocalDate.parse(dobStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"))
//                    : null;
//            BigDecimal salary = (salaryStr != null && !salaryStr.isBlank())
//                    ? new BigDecimal(salaryStr)
//                    : null;
//
//            // Create Employee object
//            Emp emp = new Emp();
//            emp.setName(name);
//            emp.setAge(age);
//            emp.setDob(dob);
//            emp.setSalary(salary);
//            emp.setAddress(address);
//
//            // Save to database
//            dao.addEmployee(emp);
//            resp.sendRedirect(req.getContextPath() + "/employees");
//            return;
//
//        } else if ("update".equals(action)) {
//            Long id = Long.valueOf(req.getParameter("id"));
//            String name = req.getParameter("name");
//            String ageStr = req.getParameter("age");
//            String dobStr = req.getParameter("dob");
//            String salaryStr = req.getParameter("salary");
//            String address = req.getParameter("address");
//
//            Integer age = (ageStr != null && !ageStr.isBlank()) ? Integer.valueOf(ageStr) : null;
//            LocalDate dob = (dobStr != null && !dobStr.isBlank())
//                    ? LocalDate.parse(dobStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"))
//                    : null;
//            BigDecimal salary = (salaryStr != null && !salaryStr.isBlank())
//                    ? new BigDecimal(salaryStr)
//                    : null;
//
//            Emp emp = new Emp();
//            emp.setId(id);
//            emp.setName(name);
//            emp.setAge(age);
//            emp.setDob(dob);
//            emp.setSalary(salary);
//            emp.setAddress(address);
//
//            dao.updateEmployee(emp);
//            resp.sendRedirect(req.getContextPath() + "/employees");
//            return;
//        }
//
//        resp.sendRedirect(req.getContextPath() + "/employees");
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//
//        String action = req.getParameter("action");
//        if (action == null) action = "list";
//
//        switch (action) {
//            case "add":
//                req.getRequestDispatcher("/views/add.jsp").forward(req, resp);
//                break;
//
//            case "delete":
//                String delId = req.getParameter("id");
//                if (delId != null) {
//                    dao.deleteEmp(Long.valueOf(delId));
//                }
//                resp.sendRedirect(req.getContextPath() + "/employees");
//                break;
//
//            default:
//                List<Emp> list = dao.getAllEmp();
//                req.setAttribute("employees", list);
//                req.getRequestDispatcher("/views/list.jsp").forward(req, resp);
//                break;
//        }
//    }
//}
