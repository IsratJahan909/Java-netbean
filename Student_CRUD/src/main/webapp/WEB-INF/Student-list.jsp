<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.abc.student_crud.entity.Student" %>
<!DOCTYPE html>
<html lang="bn">
<head>
    <meta charset="UTF-8">
    <title>Student List</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f7;
            font-family: 'Segoe UI', sans-serif;
        }
        .container {
            margin-top: 50px;
        }
        .card {
            border-radius: 15px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }
        .card-header {
            background-color: #0d6efd;
            color: white;
            border-top-left-radius: 15px;
            border-top-right-radius: 15px;
        }
        table {
            border-radius: 10px;
            overflow: hidden;
        }
        th {
            background-color: #0d6efd;
            color: white;
        }
        tr:hover {
            background-color: #eaf3ff;
        }
        .btn-add {
            background-color: #198754;
            color: white;
        }
        .btn-add:hover {
            background-color: #157347;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="card">
        <div class="card-header text-center">
            <h3>👩‍🎓 Student List</h3>
        </div>
        <div class="card-body">

            <div class="mb-3 text-end">
                <a href="add-student.jsp" class="btn btn-add">+ Add New Student</a>
            </div>

            <table class="table table-bordered table-striped text-center align-middle">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Description</th>
                        <th>Date of Birth</th>
                        <th>Updated At</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Student> students = (List<Student>) request.getAttribute("students");
                        if (students != null && !students.isEmpty()) {
                            for (Student s : students) {
                    %>
                        <tr>
                            <td><%= s.getId() %></td>
                            <td><%= s.getName() %></td>
                            <td><%= s.getEmail() %></td>
                            <td><%= s.getDescription() %></td>
                            <td><%= s.getDateOfBirth() %></td>
                            <td><%= s.getUpdatedAt() %></td>
                            <td>
                                <a href="student?action=edit&id=<%= s.getId() %>" class="btn btn-sm btn-warning">Edit</a>
                                <a href="student?action=delete&id=<%= s.getId() %>" class="btn btn-sm btn-danger" onclick="return confirm('Are you sure you want to delete this student?');">Delete</a>
                            </td>
                        </tr>
                    <%
                            }
                        } else {
                    %>
                        <tr>
                            <td colspan="7" class="text-center text-muted">No students found.</td>
                        </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>

        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
