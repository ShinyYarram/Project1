package com.ers.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.ers.db.EmployeeMapper;
import com.ers.db.HibernateUtil;
import com.ers.entity.EmployeeEntity;
import com.ers.model.Employee;

public class EmployeeLoginDaoImpl implements EmployeeLoginDao {
	private SessionFactory sf=HibernateUtil.getSessionFactory();
	private Session session;
	public EmployeeEntity login(String id,String pwd) {
		EmployeeEntity ee = null;
		List<EmployeeEntity> list=new ArrayList<EmployeeEntity>();
		try 
		{
			session=sf.openSession();
			Query q= session.createQuery("FROM EmployeeEntity e  WHERE e.employeeId=:id and e.password=:pass");
			q.setParameter("id",id);
			q.setParameter("pass", pwd);
			list=q.list();
			System.out.println(id+""+pwd);
			if(!list.isEmpty())
			{
				ee=list.get(0);
			}
		}catch (Exception e1) {
				e1.getMessage();
			}finally{
				if(session!=null)
				{
					session.close();
				}
			}
		System.out.println(ee);
		return ee;
			
}
}