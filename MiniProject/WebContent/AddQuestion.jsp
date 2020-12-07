<%@page import="com.vwits.model.*"%> 
<%@page import="java.util.List"%> 
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
<h1 align="center" style="color: white">Add Question</h1>
    <div class="register">
<form action="insertquestion" method="post"> 
		<label>SrNo</label>
		<br>
 		<input type="number" name="txtid" required="required" > <br><br> 
 		<label>Question</label><br>
 		<input type="text" name="txtque"  required="required" style="color: black"> <br><br>
 		
 		<label>Option1</label><br>
 		 <input type="text" name="txtopt1"  required="required" style="color: black"> <br><br>
 		
 		<label>Option2</label><br>
 		 <input type="text" name="txtopt2"  required="required" style="color: black"> <br><br>
 		
 		<label>Option3</label> <br>
 		<input type="text" name="txtopt3"  required="required" style="color: black"> <br><br>
 		
 		<label>Option4</label> <br>
 		<input type="text" name="txtopt4"  required="required" style="color: black"> <br><br>
 		
 		<label>Correct Answer</label><br> <input type="text" name="txtcorrect"  required="required" style="color: black"> <br><br>
 		
 		<label>Marks</label><br>
 		<input type="number" name="txtmarks"  required="required" style="color: black"><br>
 		
 		<input type="submit" value="Add Question" style="height:30px"/> 
 		
 	</form> 
 	
 	
 	<br><br>
 	
</div>
</body>
</html>