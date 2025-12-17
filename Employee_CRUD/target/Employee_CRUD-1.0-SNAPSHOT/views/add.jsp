<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Employee</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg">
        <div class="card-header bg-success text-white">
            <h4 class="mb-0">Add New Employee</h4>
        </div>
        <div class="card-body">
            <form action="insertEmployee" method="post">
                <div class="mb-3">
                    <label class="form-label">Name:</label>
                    <input type="text" name="name" class="form-control" required placeholder="Enter employee name">
                </div>
                <div class="mb-3">
                    <label class="form-label">Date of Birth:</label>
                    <input type="date" name="dob" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Department:</label>
                    <input type="text" name="department" class="form-control" required placeholder="Enter department">
                </div>
                <button type="submit" class="btn btn-success w-100">Save Employee</button>
            </form>
        </div>
        <div class="card-footer text-center">
            <a href="employee" class="btn btn-secondary btn-sm">Back to List</a>
        </div>
    </div>
</div>

</body>
</html>
