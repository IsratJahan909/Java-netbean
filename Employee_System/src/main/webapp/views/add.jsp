<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Employee</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" rel="stylesheet">
    <style>
        :root {
            --primary: #4361ee;
            --secondary: #3a0ca3;
            --success: #4cc9f0;
        }
        
        body { 
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; 
            min-height: 100vh;
            display: flex;
            align-items: center;
            padding: 20px 0;
        }
        
        .container { 
            max-width: 700px; 
            background: rgba(255, 255, 255, 0.95); 
            padding: 40px; 
            border-radius: 15px; 
            box-shadow: 0 10px 30px rgba(0,0,0,0.2);
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.3);
        }
        
        h2 { 
            margin-bottom: 30px; 
            text-align: center; 
            color: var(--secondary);
            font-weight: 700;
            position: relative;
            padding-bottom: 15px;
        }
        
        h2:after {
            content: '';
            position: absolute;
            bottom: 0;
            left: 50%;
            transform: translateX(-50%);
            width: 80px;
            height: 3px;
            background: linear-gradient(90deg, var(--primary), var(--success));
            border-radius: 2px;
        }
        
        .form-label {
            font-weight: 600;
            color: #495057;
            margin-bottom: 8px;
        }
        
        .form-control, .form-select {
            border: 2px solid #e9ecef;
            border-radius: 8px;
            padding: 12px 15px;
            transition: all 0.3s ease;
        }
        
        .form-control:focus, .form-select:focus {
            border-color: var(--primary);
            box-shadow: 0 0 0 0.2rem rgba(67, 97, 238, 0.25);
        }
        
        .gender-group {
            background: #f8f9fa;
            padding: 15px;
            border-radius: 8px;
            border: 2px solid #e9ecef;
        }
        
        .form-check-input:checked {
            background-color: var(--primary);
            border-color: var(--primary);
        }
        
        .btn-success {
            background: linear-gradient(135deg, var(--primary), var(--secondary));
            border: none;
            padding: 12px;
            font-weight: 600;
            border-radius: 8px;
            transition: all 0.3s ease;
        }
        
        .btn-success:hover {
            transform: translateY(-2px);
            box-shadow: 0 5px 15px rgba(67, 97, 238, 0.4);
        }
        
        .btn-secondary {
            background: #6c757d;
            border: none;
            padding: 12px;
            font-weight: 600;
            border-radius: 8px;
            transition: all 0.3s ease;
        }
        
        .btn-secondary:hover {
            background: #5a6268;
            transform: translateY(-2px);
        }
        
        .header-icon {
            text-align: center;
            margin-bottom: 20px;
            color: var(--primary);
            font-size: 2.5rem;
        }
        
        .required:after {
            content: " *";
            color: #dc3545;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="header-icon">
        <i class="fas fa-user-plus"></i>
    </div>
    <h2>Add New Employee</h2>
    
    <form action="${pageContext.request.contextPath}/employees" method="post">
        <!-- Name Field -->
        <div class="mb-4">
            <label class="form-label required">Full Name</label>
            <input type="text" name="name" class="form-control" placeholder="Enter employee's full name" required>
        </div>
        
        <!-- Department Dropdown -->
        <div class="mb-4">
            <label class="form-label required">Department</label>
            <select name="department" class="form-select" required>
                <option value="" selected disabled>Select Department</option>
                <option value="Engineering">Engineering</option>
                <option value="Marketing">Marketing</option>
                <option value="Sales">Sales</option>
                <option value="Human Resources">Human Resources</option>
                <option value="Finance">Finance</option>
                <option value="Operations">Operations</option>
                <option value="IT Support">IT Support</option>
                <option value="Research & Development">Research & Development</option>
                <option value="Customer Service">Customer Service</option>
                <option value="Quality Assurance">Quality Assurance</option>
            </select>
        </div>
        
        <!-- Salary Field -->
        <div class="mb-4">
            <label class="form-label required">Salary</label>
            <div class="input-group">
                <span class="input-group-text">$</span>
                <input type="number" step="0.01" name="salary" class="form-control" placeholder="0.00" min="0" required>
            </div>
        </div>
        
        <!-- Date of Birth -->
        <div class="mb-4">
            <label class="form-label required">Date of Birth</label>
            <input type="date" name="dob" class="form-control" required>
        </div>
        
        <!-- Gender Radio Buttons -->
        <div class="mb-4">
            <label class="form-label required">Gender</label>
            <div class="gender-group">
                <div class="row">
                    <div class="col-md-4">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="gender" value="Male" id="male" required>
                            <label class="form-check-label" for="male">
                                <i class="fas fa-mars me-2"></i>Male
                            </label>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="gender" value="Female" id="female">
                            <label class="form-check-label" for="female">
                                <i class="fas fa-venus me-2"></i>Female
                            </label>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="gender" value="Other" id="other">
                            <label class="form-check-label" for="other">
                                <i class="fas fa-transgender me-2"></i>Other
                            </label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <!-- Skills Field -->
        <div class="mb-4">
            <label class="form-label">Skills</label>
            <input type="text" name="skills" class="form-control" placeholder="e.g., Java, JavaScript, Project Management">
            <div class="form-text">Enter skills separated by commas</div>
        </div>
        
        <!-- Full Time Checkbox -->
        <div class="mb-4">
            <div class="form-check form-switch">
                <input type="checkbox" name="fullTime" class="form-check-input" id="fullTime" role="switch" checked>
                <label class="form-check-label" for="fullTime">
                    <i class="fas fa-briefcase me-2"></i>Full Time Employee
                </label>
            </div>
        </div>
        
        <!-- Buttons -->
        <div class="d-grid gap-2">
            <button type="submit" class="btn btn-success">
                <i class="fas fa-user-plus me-2"></i>Add Employee
            </button>
            <a href="${pageContext.request.contextPath}/employees" class="btn btn-secondary">
                <i class="fas fa-arrow-left me-2"></i>Back to Employee List
            </a>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>