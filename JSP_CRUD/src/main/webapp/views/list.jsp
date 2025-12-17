<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Employee List</title>
    <style>
        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #888;
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: #f4f4f4;
        }
        h2 {
            text-align: center;
            color: darkblue;
        }
        .actions a {
            margin: 0 5px;
            text-decoration: none;
            color: blue;
        }
        .actions a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <h2>Total Employees: ${employees.size()}</h2>
    <h2>Employee List</h2>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Date of Birth</th>
            <th>Salary</th>
            <th>Address</th>
            <th>Actions</th>
        </tr>

        <c:forEach var="e" items="${employees}">
            <tr>
                <td>${e.id}</td>
                <td>${e.name}</td>
                <td>${e.age}</td>
                <td><fmt:formatDate value="${e.dob}" pattern="dd-MM-yyyy"/></td>
                <td>${e.salary}</td>
                <td>${e.address}</td>
                <td class="actions">
                    <a href="${pageContext.request.contextPath}/employees?action=edit&id=${e.id}">Edit</a>
                    <a href="${pageContext.request.contextPath}/employees?action=delete&id=${e.id}"
                       onclick="return confirm('Delete this employee?');">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
