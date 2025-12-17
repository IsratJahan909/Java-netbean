<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="bn">
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(to right, #f9f9f9, #e8f5e9);
            font-family: 'Segoe UI', sans-serif;
        }
        .card {
            border-radius: 15px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        }
        .card-header {
            background-color: #198754;
            color: white;
            border-top-left-radius: 15px;
            border-top-right-radius: 15px;
        }
        .btn-custom {
            background-color: #198754;
            color: white;
        }
        .btn-custom:hover {
            background-color: #157347;
        }
        .form-label {
            font-weight: 500;
        }
    </style>
</head>
<body>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-header text-center">
                    <h4>👩‍🎓 Add New Student</h4>
                </div>
                <div class="card-body">

                    <form action="student" method="post">
                        <input type="hidden" name="action" value="create">

                        <div class="mb-3">
                            <label for="name" class="form-label">Student Name</label>
                            <input type="text" name="name" id="name" class="form-control" placeholder="Enter full name" required>
                        </div>

                        <div class="mb-3">
                            <label for="email" class="form-label">Email Address</label>
                            <input type="email" name="email" id="email" class="form-control" placeholder="Enter email" required>
                        </div>

                        <div class="mb-3">
                            <label for="description" class="form-label">Description</label>
                            <textarea name="description" id="description" rows="3" class="form-control" placeholder="Write a short note..."></textarea>
                        </div>

                        <div class="mb-3">
                            <label for="dateOfBirth" class="form-label">Date of Birth</label>
                            <input type="date" name="dateOfBirth" id="dateOfBirth" class="form-control" required>
                        </div>

                        <div class="text-center">
                            <button type="submit" class="btn btn-custom px-4">Save Student</button>
                            <a href="student?action=list" class="btn btn-secondary px-4">Back to List</a>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
