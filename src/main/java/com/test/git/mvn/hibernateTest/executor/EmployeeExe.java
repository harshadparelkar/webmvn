package com.test.git.mvn.hibernateTest.executor;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.test.git.mvn.hibernateTest.entity.Employee;
import com.test.git.mvn.hibernateTest.entity.EmployeeDetails;

public class EmployeeExe {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(EmployeeDetails.class);
		
		Session session = config.buildSessionFactory().openSession();		
		session.beginTransaction();
		
		
		
		
		session.getTransaction().commit();
		session.close();/**/
	}
}
