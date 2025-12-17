<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg">
        <div class="card-header bg-primary text-white d-flex justify-content-between align-items-center">
            <h4 class="mb-0">Employee List</h4>
            <a href="add-employee.jsp" class="btn btn-light btn-sm">+ Add Employee</a>
        </div>
        <div class="card-body">
            <table class="table table-bordered table-hover text-center align-middle">
                <thead class="table-secondary">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Date of Birth</th>
                    <th>Department</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="emp" items="${employeeList}">
                    <tr>
                        <td>${emp.id}</td>
                        <td>${emp.name}</td>
                        <td>${emp.dob}</td>
                        <td>${emp.department}</td>
                        <td>
                            <a href="editEmployee?id=${emp.id}" class="btn btn-warning btn-sm">Edit</a>
                            <a href="deleteEmployee?id=${emp.id}" class="btn btn-danger btn-sm"
                               onclick="return confirm('Are you sure you want to delete this employee?')">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
