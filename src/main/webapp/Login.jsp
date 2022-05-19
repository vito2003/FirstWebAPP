<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="style.css" >
  <title>Login Page</title>
</head>
<body>
<h1 class="text"> Welcome, please login</h1>
<form action="login" method="post">
  Enter your username or email: <input  type="text" name="loginname"/>
  <br>
  Enter your password: <input type="password" name="loginpassword"/>
  <br>
  <input type="submit" value="Login"/>
  <br>
  <a class="register" href="register.jsp">Register here</a>
</form>
<p style="color: red">${errorMessage}</p>
</body>
</html>