package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.DaoTest;


@Service("service")
public class ServiceTest implements IServiceTest{

	@Autowired
	DaoTest testDao;
	
	public void testServiceMethode(){
		
		System.out.println("Testing service");
	}

	public void saveValToDb(String val) {
		
		testDao.saveVal(val);
	}
}
