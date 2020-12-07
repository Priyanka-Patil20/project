<%@page import="jdk.management.resource.internal.TotalResourceContext"%>
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
<div id="wrapper">
  <div id="container">
    <div align="right" ><input id="button" type="button" value="Logout" onClick="location.href='logout' " style= "background: #f31404;color: #fff;font-size: 15px; height: 30px" ></div>
  </div>
</div>
<div class="h1">
<h1>Your Result!!!!</h1>

</div>
<div class="box">
    <p> Score</p>
    <p>Marks Scored: ${marks}</p>
    <p>Total Marks: ${Total}</p>
    <p>Questions attempted: ${attempted}</p>

</div>
</body>
</html>