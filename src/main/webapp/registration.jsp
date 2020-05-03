<%--
  Created by IntelliJ IDEA.
  User: SERJEY
  Date: 29.04.2020
  Time: 23:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration page</title>
    <meta charset="UTF-8">
    <link rel="icon" type="image/png" href="resources/images/icons/registration.ico"/>
    <link rel="stylesheet" type="text/css" href="resources/css/util.css">
    <link rel="stylesheet" type="text/css" href="resources/css/main.css">
</head>
<body>
    <div class="limiter">
        <div class="container-login100">
            <div class="wrap-login100 p-t-50 p-b-90">
                <form method="get" action="Servlet" class="login100-form validate-form flex-sb flex-w">
                    <span class="login100-form-title p-b-51">Registration</span>
                    <div class="wrap-input100 validate-input m-b-16" data-validate = "Username is required">
                        <input class="input100" type="text" name="username" placeholder="Username">
                        <span class="focus-input100"></span>
                    </div>
                    <div class="wrap-input100 validate-input m-b-16" data-validate = "Password is required">
                        <input class="input100" type="password" name="pass" placeholder="Password">
                        <span class="focus-input100"></span>
                    </div>
                    <div class="wrap-input100 validate-input m-b-16" data-validate = "Email is required">
                        <input class="input100" type="email" name="email" placeholder="Email">
                        <span class="focus-input100"></span>
                    </div>
                    <div class="flex-sb-m w-full p-t-3 p-b-24">
                        <div class="contact100-form-checkbox">
                            <input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
                            Remember me</label>
                        </div>
                    </div>
                    <div class="container-login100-form-btn m-t-17">
                        <input type="submit" name="action" value="registration" class="register100-form-btn"/>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
