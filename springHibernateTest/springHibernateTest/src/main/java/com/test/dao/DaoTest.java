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
	SessionFactory factory;
	
	
	public SessionFactory getFactory() {
		return factory;
	}


	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}


	public void saveVal(String val) {
		// TODO save to mysql
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		Valuemap valMap = new Valuemap();
		valMap.setKey_col(UUID.randomUUID().toString().substring(0, 20));
		valMap.setVal_col(val);
		
		session.save(valMap);
		session.getTransaction().commit();
		
	}

}
