package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.DaoTest;
import com.test.entity.Valuemap;


@Service("service")
public class ServiceTest implements IServiceTest{

	@Autowired
	DaoTest testDao;
	
	public void testServiceMethode(){
		
		System.out.println("Testing service");
	}

	public void saveValToDb(Valuemap valMap) {
		
		testDao.saveVal(valMap);
	}
}
