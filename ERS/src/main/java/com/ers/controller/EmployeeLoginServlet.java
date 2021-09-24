package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.EmployeeEntity;
import com.ers.service.EmployeeLoginService;
import com.ers.service.EmployeeLoginServiceImpl;


public class EmployeeLoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String pwd=request.getParameter("password");
		EmployeeLoginService sld=new EmployeeLoginServiceImpl();
		EmployeeEntity e=sld.login(id, pwd);
		
		RequestDispatcher rd=null;
		
		if(e==null) {
			out.print("Incorrect Id 0r password");
			rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}else {
			System.out.println(e.getType());
			if(e.getType().equalsIgnoreCase("manager")){
				rd=request.getRequestDispatcher("ManagerHome.html");
				rd.forward(request, response);
		}
			else{
				rd=request.getRequestDispatcher("EmployeeHome.html");
			rd.forward(request, response);
			}
		}
	}

}
