<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <title>Auca Student Registration</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <style>
        body {
            background-image: url("images/download.jpg");
            background-repeat: no-repeat; /* Prevent background image from repeating */
            background-size: cover;
        }

        .user_card {
            align-self: center;
            height: auto;
            width: 350px;
            margin: 0 auto;
            background: white;
            padding: 20px;
            border-radius: 5px;
            margin-top: 80px;
            justify-content: center;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
        }

        .brand_logo_container {
            text-align: center;
        }

        .brand_logo {
            width: 150px;
            height: 150px;
            border-radius: 50%;
            border: 2px solid white;
        }

        .form_container {
            margin-top: 20px;
        }

        .login_btn {
            width: 100%;
            background: #60a3bc !important;
            color: white !important;
        }

        .login_container {
            text-align: center;
        }

        .custom-control-label::before {
            background-color: #60a3bc !important;
        }
    </style>
</head>

<body>

<div class="container h-100">
    <div class="d-flex justify-content-center h-100">
        <div class="user_card">
            <div class="brand_logo_container">
                <img src="images/logo.png" class="brand_logo" alt="Logo">
            </div>
            <div class="form_container">
                <form action="/LoginServlet" method="post">
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-user"></i></span>
                        </div>
                        <input type="text" name="userName" class="form-control input_user" value="" placeholder="Email or ID" required="">
                    </div>
                    <div class="input-group mb-2">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-key"></i></span>
                        </div>
                        <input type="password" name="password" class="form-control input_pass" value="" placeholder="Password" required="">
                    </div>
                    <div class="form-group">
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="customControlInline">
                            <label class="custom-control-label" for="customControlInline">Remember Me</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="user_type">Select User Type:</label>
                        <select class="form-control" id="user_type" name="user_type">
                            <option value="student">Student</option>
                            <option value="staff">Staff</option>
                        </select>
                    </div>
                    <div class="d-flex justify-content-center mt-3 login_container">
                        <button type="submit" name="button" class="btn login_btn">Login</button>
                    </div>
                    <div class="mt-3 login_container">
                        <a href="#" class="text-info">Forgot Password</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>

</html>
