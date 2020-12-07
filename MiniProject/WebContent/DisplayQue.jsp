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
<h1 align="center" style="color: white">Question Bank</h1>
<table align="center" border="1" style="color: white" > 
 	
 		<% 
 	
 		out.println("<tr><th>SrNo</th><th>Question</th><th>Option 1</th><th>Option 2</th><th>Option 3</th><th>Option 4</th><th>Correct Answer</th><th>Marks</th>");
 			List<Test> list = (List<Test>) request.getAttribute("data"); 
 			if (list != null) { 
 				for (Test t : list) { 
 					; 
 					out.println("</tr><tr> <td>" + t.getSr_no() + "</td> <td>" + t.getQuestion() + "</td> <td>" + t.getOption1() + "</td> <td>" + t.getOption2()+ "</td> <td>" + t.getOption3()+ "</td> <td>" + t.getOption4()+ "</td> <td>" + t.getCorrectans()+"</td> <td>"+ t.getMarks()
 							+ "</td>    </tr>"); 
 				} 
 			} 
 		%> 
 	</table> 
</body>
</html>