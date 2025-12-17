<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.abc.student_crud.entity.Student" %>
<!DOCTYPE html>
<html lang="bn">
<head>
    <meta charset="UTF-8">
    <title>Edit Student</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(120deg, #f5f9ff, #e7fff8);
            font-family: 'Poppins', sans-serif;
        }
        .edit-container {
            max-width: 650px;
            margin: 60px auto;
            background: #fff;
            border-radius: 20px;
            box-shadow: 0 6px 20px rgba(0,0,0,0.15);
            overflow: hidden;
        }
        .edit-header {
            background: #0d6efd;
            color: #fff;
            text-align: center;
            padding: 15px;
            font-size: 1.5rem;
            font-weight: 600;
            letter-spacing: 0.5px;
        }
        .form-section {
            padding: 25px 35px;
        }
        label {
            font-weight: 500;
            margin-bottom: 5px;
        }
        .btn-update {
            background-color: #198754;
            color: white;
            font-weight: 500;
            border-radius: 8px;
            padding: 8px 30px;
        }
        .btn-update:hover {
            background-color: #157347;
        }
        .btn-cancel {
            background-color: #6c757d;
            color: white;
            font-weight: 500;
            border-radius: 8px;
            padding: 8px 30px;
        }
        .btn-cancel:hover {
            background-color: #5c636a;
        }
    </style>
</head>
<body>

<%
    Student student = (Student) request.getAttribute("student");
    if (student == null) {
%>
    <div class="container text-center mt-5">
        <h3 class="text-danger">❌ No student data found!</h3>
        <a href="student?action=list" class="btn btn-primary mt-3">Back to List</a>
    </div>
<%
    } else {
%>

<div class="edit-container">
    <div class="edit-header">✏️ Edit Student Information</div>
    <div class="form-section">
        <form action="student" method="post">
            <input type="hidden" name="action" value="update">
            <input type="hidden" name="id" value="<%= student.getId() %>">

            <div class="mb-3">
                <label for="name">Student Name</label>
                <input type="text" class="form-control" id="name" name="name"
                       value="<%= student.getName() %>" required>
            </div>

            <div class="mb-3">
                <label for="email">Email Address</label>
                <input type="email" class="form-control" id="email" name="email"
                       value="<%= student.getEmail() %>" required>
            </div>

            <div class="mb-3">
                <label for="description">Description</label>
                <textarea class="form-control" id="description" name="description" rows="3"><%= student.getDescription() %></textarea>
            </div>

            <div class="mb-3">
                <label for="dateOfBirth">Date of Birth</label>
                <input type="date" class="form-control" id="dateOfBirth" name="dateOfBirth"
                       value="<%= student.getDateOfBirth() %>" required>
            </div>

            <div class="text-center mt-4">
                <button type="submit" class="btn btn-update me-2">💾 Update Student</button>
                <a href="student?action=list" class="btn btn-cancel">↩️ Cancel</a>
            </div>
        </form>
    </div>
</div>

<%
    }
%>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
