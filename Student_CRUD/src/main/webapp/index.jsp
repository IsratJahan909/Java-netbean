
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Student Management System</title>
<!-- Google Fonts -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;700&display=swap" rel="stylesheet" />

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />

<style>
    body {
        background: linear-gradient(135deg, #89f7fe, #66a6ff);
        font-family: 'Poppins', sans-serif;
        height: 100vh;
        margin: 0;
        display: flex;
        align-items: center;
        justify-content: center;
    }

    .home-card {
        background: #ffffff;
        border-radius: 20px;
        box-shadow: 0 15px 40px rgba(0, 0, 0, 0.1);
        padding: 60px 80px;
        max-width: 700px;
        width: 100%;
        text-align: center;
        transition: transform 0.4s, box-shadow 0.4s;
    }

    .home-card:hover {
        transform: rotateY(3deg) translateY(-8px);
        box-shadow: 0 20px 50px rgba(0, 0, 0, 0.2);
    }

    .home-card h1 {
        font-size: 3rem;
        font-weight: 700;
        color: #0d6efd;
        margin-bottom: 20px;
        letter-spacing: 2px;
    }

    .home-card p {
        color: #555;
        font-size: 1.2rem;
        margin-bottom: 50px;
        line-height: 1.5;
    }

    .btn-custom {
        font-weight: 600;
        border-radius: 12px;
        padding: 14px 35px;
        font-size: 1.2rem;
        transition: all 0.3s ease;
        min-width: 180px;
    }

    .btn-add {
        background-color: #0d6efd;
        color: #fff;
    }
    .btn-add:hover {
        background-color: #0b5ed7;
        transform: scale(1.05);
    }

    .btn-list {
        background-color: #198754;
        color: #fff;
    }
    .btn-list:hover {
        background-color: #157347;
        transform: scale(1.05);
    }

    @media(max-width: 700px) {
        .home-card {
            padding: 40px 20px;
        }
        .home-card h1 {
            font-size: 2.5rem;
        }
        .home-card p {
            font-size: 1rem;
            margin-bottom: 30px;
        }
        .btn-custom {
            padding: 12px 25px;
            font-size: 1rem;
            min-width: 150px;
        }
    }
</style>
</head>
<body>
    <div class="home-card">
        <h1>Student Management System</h1>
        <p>Manage students efficiently - Add, View, Edit & Delete</p>
        <div class="d-flex justify-content-center gap-4 flex-wrap">
            <a href="add-student.jsp" class="btn btn-custom btn-add">? Add Student</a>
            <a href="student?action=list" class="btn btn-custom btn-list">? View Student List</a>
        </div>
    </div>
</body>
</html>