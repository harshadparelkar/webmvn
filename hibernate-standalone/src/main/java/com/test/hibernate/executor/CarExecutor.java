package com.test.hibernate.executor;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.test.hibernate.entity.Car;
import com.test.hibernate.entity.Maruti;
import com.test.hibernate.entity.Vehicel;

public class CarExecutor {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Vehicel.class);
		config.addAnnotatedClass(Car.class);
		config.addAnnotatedClass(Maruti.class);
		
		
		Session session = config.buildSessionFactory().openSession();		
		session.beginTransaction();
		
		
		
		
		session.getTransaction().commit();
		session.close();/**/
		
	}

}
