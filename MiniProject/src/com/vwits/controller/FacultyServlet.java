package com.vwits.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FacultyServlet
 */
@WebServlet("/facultylogin")
public class FacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text.html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		String pass=request.getParameter("pass");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			
			PreparedStatement ps=con.prepareStatement("Select * from faculty where name=? and password=?");
			ps.setString(1, name);
			ps.setString(2, pass);
			
			ResultSet rs=ps.executeQuery();
			RequestDispatcher r=request.getRequestDispatcher("FacultyLogin.jsp");
			if(rs.next()) {
				
				HttpSession session=request.getSession();
				//if(session.isNew())
				//{
				session.setAttribute("name",name);
				session.setAttribute("Password",pass);
				response.sendRedirect("FacultyInfo.html"); //view student result page
				//request.setAttribute("message", "<p style='color:green'>Login Successsful!!!!...</p>");
				//}
				//else
				//{
					//out.println("<h3>You already loged-in Pls logout first.<a href='logout'>Click here to Logout</a></h3>");
				//}
				
			}else {
				request.setAttribute("message", "<p style='color:red'>Invalid Credentials!!!...</p>");
				r.forward(request, response);
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
	}

}
