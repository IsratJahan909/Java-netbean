<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.abc.employee_system.entity.Employees" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Employee</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background: #f0f2f5; font-family: 'Segoe UI', sans-serif; }
        .container { max-width: 700px; margin-top: 50px; background: #fff; padding: 30px; border-radius: 10px; box-shadow: 0 0 15px rgba(0,0,0,0.1);}
        h2 { margin-bottom: 25px; text-align: center; }
        .form-check { margin-right: 15px; }
    </style>
</head>
<body>
<div class="container">
    <%
        Employees emp = (Employees) request.getAttribute("employee");
        if(emp == null){
            response.sendRedirect(request.getContextPath()+"/employees");
        }
    %>
    <h2>Edit Employee</h2>
    <form action="${pageContext.request.contextPath}/employees" method="post">
        <input type="hidden" name="id" value="<%= emp.getId() %>">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" name="name" class="form-control" value="<%= emp.getName() %>" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Department</label>
            <input type="text" name="department" class="form-control" value="<%= emp.getDepartment() %>" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Salary</label>
            <input type="number" step="0.01" name="salary" class="form-control" value="<%= emp.getSalary() %>" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Date of Birth</label>
            <input type="date" name="dob" class="form-control" value="<%= emp.getDob() %>" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Gender</label><br>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="gender" value="Male" <%= "Male".equals(emp.getGender()) ? "checked" : "" %>>
                <label class="form-check-label">Male</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="gender" value="Female" <%= "Female".equals(emp.getGender()) ? "checked" : "" %>>
                <label class="form-check-label">Female</label>
            </div>
        </div>
        <div class="mb-3">
            <label class="form-label">Skills (comma separated)</label>
            <input type="text" name="skills" class="form-control" value="<%= emp.getSkills() %>">
        </div>
        <div class="mb-3 form-check">
            <input type="checkbox" name="fullTime" class="form-check-input" id="fullTime" <%= emp.getFullTime() != null && emp.getFullTime() ? "checked" : "" %>>
            <label class="form-check-label" for="fullTime">Full Time</label>
        </div>
        <button type="submit" class="btn btn-warning w-100">Update Employee</button>
        <a href="${pageContext.request.contextPath}/employees" class="btn btn-secondary w-100 mt-2">Back to List</a>
    </form>
</div>
</body>
</html>
