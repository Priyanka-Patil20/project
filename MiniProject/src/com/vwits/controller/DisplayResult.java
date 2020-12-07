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
import com.vwits.model.Result;
import com.vwits.model.Test;

/**
 * Servlet implementation class DisplayResult
 */
@WebServlet("/viewresult")
public class DisplayResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayResult() {
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
		DaoImplementation d=new DaoImplementation();
		List<Result> list = d.getAllResult(); 
 		RequestDispatcher r = request.getRequestDispatcher("ViewResult.jsp"); 
 		request.setAttribute("data", list); 
 		r.forward(request, response); 
	}

}
