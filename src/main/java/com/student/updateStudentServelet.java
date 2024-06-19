package com.student;

import java.io.IOException;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateStudentServelet")
public class updateStudentServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String id = request.getParameter("id");
		String Name = request.getParameter("Name");
		String Email = request.getParameter("Email");
		String ClassName = request.getParameter("ClassName");
		String NIC = request.getParameter("NIC");
		String Address = request.getParameter("Address");
		String DOB = request.getParameter("DOB");
		String Gender = request.getParameter("Gender");
		
		
		boolean isTrue;
		
		isTrue = addstudentDButil.updatestudent(id, Name, Email,ClassName,NIC,Address,DOB,Gender);
		
		if(isTrue == true) {
			
			List<student> studetails = addstudentDButil.getstudentdetails(id);
			request.setAttribute("stuDetails", studetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<student> studetails = addstudentDButil.getstudentdetails(id);
			request.setAttribute("studentails",studetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("userccount.jsp");
			dis.forward(request, response);
		}
	}
	}


