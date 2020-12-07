package com.vwits.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vwits.dao.DaoImplementation;

import com.vwits.model.Test;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/testform")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
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
		DaoImplementation d=new DaoImplementation();
		int count=0;
		int num=0;
		HttpSession session = request.getSession(false) ;
		//if(session != null)
		//{
		List<Test> list=d.getAllTest();
		RequestDispatcher r=request.getRequestDispatcher("TestForm.jsp"); 
		request.setAttribute("data", list);
		r.forward(request, response);
		
		

		//}
	}

	

}
