<%--
  Created by IntelliJ IDEA.
  User: vitom
  Date: 5/19/2022
  Time: 9:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Register here</h1>
<form action="register" method="post">
    Enter your username or email: <input type="text" name="rusernameORemail">
    <br>
    Enter your password: <input type="text" name="rpassword">
    <br>
    Please , confirm password: <input type="text" name="rrepeatpassword">
    <br>
    Enter your name: <input type="text" name="rname">
    <br>
    Enter your surname: <input type="text" name="rsurname">
    <br>
    Enter your proffesion: <input type="text" name="rproffesion">
    <br>
    <input type="submit" value="register">
</form>
<p style="color: red">${errorMessage}</p>
</body>
</html>
