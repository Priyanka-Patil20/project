<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="reg"><h1>Faculty Registration</h1></div>
    <div class="register">
<form action="facultyregistration" method="post">
<br>
            <br>
            <label>Roll No :</label><br>
            <input type="text" name="id" placeholder="Enter your ID" style="color: black"/><br/><br>

            <label>Student Name :</label><br>
            <input type="text" name="username" placeholder="Enter your Name" style="color: black"/><br/><br>

            <label>Password :</label><br>
            <input type="password" id="pass" name="pass" placeholder="Enter your Password" style="color: black"/><br/><br>
            <label>Email :</label><br>
            <input type="text" name="email" placeholder="Enter your Email" style="color: black"/><br/><br>
            <label>Contact Number :</label><br>
            <input type="text" name="contact" placeholder="Enter your Contact No" style="color: black"/><br/><br>

            <input align=center type="submit" value="Register"/>

</form>
</div>
</body>
</html>