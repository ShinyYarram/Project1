package com.ers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.hibernate.Session;

import com.ers.db.DBUtil;
import com.ers.db.EmployeeMapper;
import com.ers.db.HibernateUtil;
import com.ers.model.Employee;

public class EmployeeRegistrationDaoImpl {
	
	 public void addEmployee(Employee e) {
		
		 try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				//session i sused for communicating with db
				session.beginTransaction();  //insert,update,delete,  not required for select
				session.save(EmployeeMapper.mapEmployee(e));
				System.out.println("employee inserted...");
				session.getTransaction().commit();
				
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
	 }
}
