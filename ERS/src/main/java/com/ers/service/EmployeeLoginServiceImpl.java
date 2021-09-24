package com.ers.service;

import com.ers.dao.EmployeeLoginDao;
import com.ers.dao.EmployeeLoginDaoImpl;
import com.ers.entity.EmployeeEntity;

public class EmployeeLoginServiceImpl implements EmployeeLoginService {
	EmployeeLoginDao employeeDao=new EmployeeLoginDaoImpl();
	
	public EmployeeEntity login(String id, String pwd) {
		// TODO Auto-generated method stub
		System.out.println("In service");
		return employeeDao.login(id,pwd);
	}

}
