<%@page import="com.vwits.controller.*"%> 
<%@page import="java.util.List"%> 
<%@page import="com.vwits.model.*"%>
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
<form action="result" method="get">
<div align="center">
<h2 style="color:white">GK Test</h2>

<%
			int count=0;
			int radioname=0;
          List<Test> list = (List<Test>) request.getAttribute("data"); 
          			if (list != null) { 
          				for (Test t : list) { 
          					%>
           					<div class="form-group" style="color:white">
                                                           <label><%=t.getSr_no()%>.&nbsp;&nbsp;<%=t.getQuestion() %></label>
                                              </div>
             
                                              <div class="radio" style="color:white" >
                                                    <input type="radio" value="a" name="<%=radioname%>">&nbsp;<%=t.getOption1()%>
                                              </div>
             
                                              <div class="radio" style="color:white">
                                                    <input  type="radio" value="b" name="<%=radioname%>">&nbsp;<%=t.getOption2()%>
                                              </div>
             
                                              <div class="radio" style="color:white">
                                                    <input type="radio" value="c" name="<%=radioname%>">&nbsp;<%=t.getOption3()%>
                                              </div>
             
                                              <div class="radio" style="color:white">
                                                    <input type="radio" value="d" name="<%=radioname%>">&nbsp;<%=t.getOption4()%>
                                              </div>
                                                                  
                                                                  
                                                           
                                              <%
                                                           radioname++;
                                                          
                                                           }
                                              %>
                                              <br>
                                              <br>
                                             
                                                    <input style= "background: #f31404;color: #fff;font-size: 15px; height: 40px" align=center type="submit" value="Submit Exam" class="btn btn-primary">
                                                    
                                              
           <% 
           				} 
           			

          
          %>
          
</div>

</form>
</body>
</html>