package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.bo.IDGenerator;
import com.ers.model.Employee;
import com.ers.service.EmployeeRegistrationServiceImpl;

public class EmployeeRegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String name=request.getParameter("name");
		String des=request.getParameter("des");
		String dep=request.getParameter("dep");
		String email=request.getParameter("email");
		String type=request.getParameter("type");
	//	String newid=IDGenerator.generateID();
		//model is mapped
		Employee employee=new Employee();
		employee.setEmployeeId(id);
		employee.setEmployeeName(name);
		employee.setDepartment(dep);
		employee.setDesignation(des);
		employee.setType(type);
		employee.setEmail(email);
		employee.setPassword(pwd);
		
		//service need to be invoked 
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		employeeService.addEmployee(employee);
		out.println(" Registration / Sign up success");
		//out.println(id+"  "+name);
		
	}

}
