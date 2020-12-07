package com.vwits.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vwits.dao.DaoImplementation;
import com.vwits.model.Faculty;

/**
 * Servlet implementation class TeacherUpdateServlet
 */
@WebServlet("/update")
public class TeacherUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherUpdateServlet() {
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
HttpSession session = request.getSession(false) ;
		
		if(session != null)
		{
			
			String pass = request.getParameter("pass"); 
			String email= request.getParameter("email");
			String contact = request.getParameter("contact");
			String Id= (String) session.getAttribute("roll");
			String name=(String) session.getAttribute("name");
			System.out.println(name);
			System.out.println(Id);
			DaoImplementation d=new DaoImplementation();
			d.update(new Faculty(Integer.parseInt(Id),name,pass,email,Integer.parseInt(contact)));
		
		}
	}

}
