package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.service.IServiceTest;

@Controller
public class ControllerTest {

	@Autowired
	IServiceTest service;
	
	@RequestMapping(value="/test")
	public @ResponseBody ResponseEntity<Object> testService( @RequestParam String val){
		
		if( !StringUtils.isEmpty(val)) {
			service.saveValToDb(val);
		}
		
		return new ResponseEntity( val, HttpStatus.OK);		
	}
}
