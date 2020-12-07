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
<h1 align="center" style="color: white">Result</h1>
<table align="center" border="1" style="color: white" > 
 	
 		<% 
 	
 		out.println("<tr><th>Name</th><th>Marks Obtained</th><th>Total Marks</th>");
 			List<Result> list = (List<Result>) request.getAttribute("data"); 
 			if (list != null) { 
 				for (Result r : list) { 
 					; 
 					out.println("</tr><tr> <td>" + r.getName() + "</td> <td>" + r.getMarks() + "</td> <td>" + r.getTotalmarks() + "</td>    </tr>"); 
 				} 
 			} 
 		%> 
 	</table> 
</body>
</html>