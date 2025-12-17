<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        .form-container {
            width: 420px;
            margin: 60px auto;
            background: #fff;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
        }
        h2 {
            text-align: center;
            color: #333;
        }
        label {
            display: block;
            margin-top: 12px;
            color: #555;
        }
        input[type="text"],
        input[type="number"],
        input[type="date"],
        input[type="submit"] {
            width: 100%;
            padding: 8px;
            margin-top: 6px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            font-size: 16px;
            margin-top: 18px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h2>Add Employee</h2>
    <form action="${pageContext.request.contextPath}/employees" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" id="name" required>

        <label for="age">Age:</label>
        <input type="number" name="age" id="age" required>

        <label for="dob">Date of Birth:</label>
        <input type="date" name="dob" id="dob" required>

        <label for="salary">Salary:</label>
        <input type="text" name="salary" id="salary" required>

        <label for="address">Address:</label>
        <input type="text" name="address" id="address" required>

        <input type="submit" value="Add Employee">
    </form>
</div>
</body>
</html>
