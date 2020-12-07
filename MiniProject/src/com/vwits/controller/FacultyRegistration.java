package com.vwits.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vwits.dao.DaoImplementation;
import com.vwits.model.Faculty;

/**
 * Servlet implementation class FacultyRegistration
 */
@WebServlet("/facultyregistration")
public class FacultyRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyRegistration() {
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
		String id = request.getParameter("id");
		String name=request.getParameter("username");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
	
		DaoImplementation d=new DaoImplementation();
		
		int x=d.saveFaculty(new Faculty(Integer.parseInt(id), name, pass, email,Integer.parseInt(contact)));
		if(x>0) {
			out.println("You are successfully registered");
			response.sendRedirect("facultylogin");
		}
	
	}

}
