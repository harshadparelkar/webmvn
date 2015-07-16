package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.entity.Valuemap;
import com.test.service.IServiceTest;

@Controller
public class ControllerTest {

	@Autowired
	IServiceTest service;
	
	@RequestMapping(value="/test")
	public @ResponseBody ResponseEntity<Object> testService( @RequestParam String val, @RequestParam String key){
		
		if( !StringUtils.isEmpty(val) && !StringUtils.isEmpty(key)) {
			Valuemap valmap = new Valuemap();
			valmap.setKey_col(key);
			valmap.setVal_col(val);
			service.saveValToDb(valmap);
		}
		
		return new ResponseEntity( val, HttpStatus.OK);		
	}
}
