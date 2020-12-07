package com.vwits.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegistration
 */
@WebServlet("/studentregistration")
public class StudentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistration() {
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String roll = request.getParameter("roll");
		String name=request.getParameter("username");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setInt(1,Integer.parseInt(roll));
			ps.setString(2, name);
			ps.setString(3, pass);
			ps.setString(4,email);
			ps.setInt(5,Integer.parseInt(contact));
			RequestDispatcher rr=request.getRequestDispatcher("Registration.jsp");
			int i=ps.executeUpdate();
			if(i>0) {
				response.sendRedirect("studentlogin");
			}
			else {
				request.setAttribute("message", "<p style='color:red'>Already Registered!!! Enter Diffirent Username</p>");
				rr.forward(request, response);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
	}

}
