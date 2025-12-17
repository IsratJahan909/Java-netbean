<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.abc.student_crud.entity.Student" %>
<!DOCTYPE html>
<html lang="bn">
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #e8f0ff, #f8fff8);
            font-family: 'Segoe UI', sans-serif;
        }
        .form-card {
            background: white;
            border-radius: 20px;
            box-shadow: 0 6px 20px rgba(0, 0, 0, 0.15);
            padding: 30px;
            margin-top: 60px;
        }
        .form-header {
            background-color: #0d6efd;
            color: white;
            border-radius: 20px 20px 0 0;
            padding: 15px;
            text-align: center;
        }
        .btn-save {
            background-color: #198754;
            color: white;
        }
        .btn-save:hover {
            background-color: #157347;
        }
        .btn-cancel {
            background-color: #6c757d;
            color: white;
        }
        .btn-cancel:hover {
            background-color: #5c636a;
        }
        label {
            font-weight: 500;
        }
    </style>
</head>
<body>

<%
    Student student = (Student) request.getAttribute("student");
    boolean isEdit = (student != null);
%>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="form-card">
                <div class="form-header">
                    <h3><%= isEdit ? "✏️ Edit Student" : "👩‍🎓 Add New Student" %></h3>
                </div>

                <form action="student" method="post" class="mt-3">

                    <input type="hidden" name="action" value="<%= isEdit ? "update" : "create" %>">
                    <% if (isEdit) { %>
                        <input type="hidden" name="id" value="<%= student.getId() %>">
                    <% } %>

                    <div class="mb-3">
                        <label for="name" class="form-label">Student Name</label>
                        <input type="text" cla
