package com.test.service;

import org.springframework.stereotype.Service;


@Service
public class ServiceTest implements IServiceTest{

	public void testServiceMethode(){
		
		System.out.println("Testing service");
	}
}
