package com.test.dao;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.entity.Valuemap;

@Repository("testDao")
public class DaoTest {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public SessionFactory getFactory() {
		return sessionFactory;
	}


	public void setFactory(SessionFactory factory) {
		this.sessionFactory = factory;
	}


	public void saveVal(Valuemap valMap) {
		// TODO save to mysql
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		valMap.setId(UUID.randomUUID().toString());
		
		session.save(valMap);
		session.getTransaction().commit();
		
	}

}
