

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP CRUD - Home</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    <style>
        body {
            background: #f8f9fa;
        }
        .navbar {
            background-color: #0d6efd;
        }
        .navbar-brand, .nav-link, .navbar-text {
            color: white !important;
        }
        .container {
            margin-top: 60px;
        }
        .card {
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }
        .btn {
            border-radius: 8px;
        }
    </style>
</head>
<body>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg">
        <div class="container-fluid">
            <a class="navbar-brand fw-bold" href="home.jsp">JSP CRUD</a>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link" href="employees">Employees</a></li>
<li class="nav-item"><a class="nav-link" href="department">Departments</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Main content -->
    <div class="container text-center">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card p-4 mt-5">
                    <h2 class="text-primary mb-4">Welcome to JSP CRUD Application</h2>
                    <p class="lead text-muted">Manage employees and departments easily.</p>

                    <div class="d-grid gap-3 mt-4">
                        <a href="employees" class="btn btn-primary btn-lg">👥 View Employees</a>
                        <a href="employees?action=add" class="btn btn-success btn-lg">➕ Add Employee</a>
                        <a href="department" class="btn btn-primary btn-lg">🏢 View Departments</a>
                        <a href="department?action=add" class="btn btn-success btn-lg">➕ Add Department</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>