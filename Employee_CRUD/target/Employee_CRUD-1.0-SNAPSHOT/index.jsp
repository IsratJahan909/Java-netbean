<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Management System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(135deg, #74ABE2, #5563DE);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .card {
            border-radius: 15px;
            box-shadow: 0 5px 20px rgba(0,0,0,0.2);
        }
        .btn-custom {
            transition: 0.3s;
        }
        .btn-custom:hover {
            transform: scale(1.05);
        }
    </style>
</head>
<body>

<div class="container">
    <div class="card text-center p-4 bg-light" style="max-width: 500px; margin: auto;">
        <h2 class="mb-3 text-primary"> Employee Management System</h2>
        <p class="text-muted mb-4">Manage your employees efficiently using JSP, Servlet & JDBC</p>
        
        <div class="d-grid gap-3">
           <a href="${ctx}/employee" class="btn btn-primary btn-lg">📋 View All employees</a>
            <a href="${ctx}/employee?action=add" class="btn btn-success btn-lg">➕ Add New employee</a>
        </div>
        
        <hr class="my-4">
        <p class="small text-secondary">Developed by Israt </p>
    </div>
</div>

</body>
</html>

