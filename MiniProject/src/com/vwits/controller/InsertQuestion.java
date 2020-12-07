package com.vwits.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vwits.dao.DaoImplementation;
import com.vwits.model.Test;

/**
 * Servlet implementation class InsertQuestion
 */
@WebServlet("/insertquestion")
public class InsertQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertQuestion() {
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
		String sr_no = request.getParameter("txtid"); 
		String Question = request.getParameter("txtque"); 
		String opt1 = request.getParameter("txtopt1"); 
		String opt2 = request.getParameter("txtopt2");
		String opt3 = request.getParameter("txtopt3");
		String opt4 = request.getParameter("txtopt4");
		String correct = request.getParameter("txtcorrect");
		String marks = request.getParameter("txtmarks");
		DaoImplementation d=new DaoImplementation();
		d.saveTest(new Test(Integer.parseInt(sr_no), Question,opt1,opt2,opt3,opt4,correct,Integer.parseInt(marks))); 
		 
		 
		 		List<Test> list = d.getAllTest(); 
		 		RequestDispatcher r = request.getRequestDispatcher("AddQuestion.jsp"); 
		 		request.setAttribute("data", list); 
		 		r.forward(request, response); 


	}

}
