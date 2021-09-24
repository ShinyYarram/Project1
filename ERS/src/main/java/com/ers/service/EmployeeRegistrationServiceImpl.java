package com.ers.service;

import com.ers.dao.EmployeeRegistrationDaoImpl;
import com.ers.model.Employee;

public class EmployeeRegistrationServiceImpl implements EmployeeRegistrationService{
	EmployeeRegistrationDaoImpl employeeDao=new EmployeeRegistrationDaoImpl();
	 public void addEmployee(Employee e) {
		 employeeDao.addEmployee(e);
		 
	 }
}
