package com.ers.db;

import com.ers.entity.EmployeeEntity;
import com.ers.model.Employee;

public class EmployeeMapper {
	
	public static EmployeeEntity mapEmployee(Employee e) {
		EmployeeEntity entity=new EmployeeEntity();
		entity.setEmployeeId(e.getEmployeeId());
		entity.setEmployeeName(e.getEmployeeName());
		entity.setDesignation(e.getDesignation());
		entity.setDepartment(e.getDepartment());
		entity.setEmail(e.getEmail());
		entity.setPassword(e.getPassword());
		entity.setType(e.getType());
		return entity;
		
	}

}
