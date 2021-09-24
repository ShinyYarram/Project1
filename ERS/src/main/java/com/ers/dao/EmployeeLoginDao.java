package com.ers.dao;

import com.ers.entity.EmployeeEntity;

public interface EmployeeLoginDao {

	EmployeeEntity login(String id, String pwd);
}
