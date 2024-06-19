package com.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addstudentservlet")
public class addstudentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//int id = request.getParameter("field1");
		String Name = request.getParameter("field2");
		String Email = request.getParameter("field3");
		String ClassName = request.getParameter("field4");
		String NIC = request.getParameter("field5");
		String Address = request.getParameter("field6");
		String DOB = request.getParameter("field7");
		String Gender = request.getParameter("field8");
		
		
		boolean isTrue;
		
		isTrue = addstudentDButil.Insertstudent( Name, Email, ClassName,NIC,Address,DOB,Gender);
				
	  if(isTrue == true) {
		  RequestDispatcher dis = request.getRequestDispatcher("submitSuccess.jsp");
		  dis.forward(request,response);
	  }else {
		  RequestDispatcher dis2 = request.getRequestDispatcher("submitUnsuccess.jsp");
		  dis2.forward(request,response);
	  }
	}
	}


