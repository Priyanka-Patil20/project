package com.vwits.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vwits.dao.DaoImplementation;
import com.vwits.model.Result;
import com.vwits.model.Test;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet("/result")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultServlet() {
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
		HttpSession session = request.getSession(false) ;

		if(session != null)
		{
			String[] answer = new String[100];
			int[] tmarks=new int[100];
            List<Test> questionList = d.getAllTest();
            int i = 0;
            int marks = 0;
            int total=0;
            int size = questionList.size();
            for(Test q : questionList)
                   {   
                         answer[i] = q.getCorrectans();
                         tmarks[i]=q.getMarks();
                           i++;
                   }
            String[] studentAnswer = new String[100];
            for(int j = 0 ; j < size ; j++)
                   {
                         studentAnswer[j] = request.getParameter(Integer.toString(j));
                         //System.out.println(studentAnswer[j]);
                   }
            
            int correctanswer=0;
            int unattempted = 0;
            int wronganswer=0;
            for(int k = 0 ; k< size;k++)
            {
                   if(studentAnswer[k].equalsIgnoreCase(answer[k]))
                   {
                         correctanswer++;
                         marks=marks+tmarks[k];
                   }
                   else if(studentAnswer[k].equals("e"))
                   {
                         unattempted++;
                   }
                   else
                   {
                         wronganswer++;
                   }
                   total=total+tmarks[k];
            }
            int attemped = size - unattempted;

				out.println(marks+"/"+total);
				RequestDispatcher r = request.getRequestDispatcher("score.jsp"); 
				//System.out.println(marks+" "+Total);
				request.setAttribute("attempted", attemped);
				request.setAttribute("marks", marks);
				request.setAttribute("Total", total); 
				
				  String name=(String) session.getAttribute("name");
				  d.saveResult(new Result(name,marks,total));
				  r.forward(request, response);
					}
					
	}

}


