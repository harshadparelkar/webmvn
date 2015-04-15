package com.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest {

	@RequestMapping(value="/test")
	public @ResponseBody ResponseEntity<Object> testService( @RequestParam String val){
		
		return new ResponseEntity( val, HttpStatus.OK);		
	}
}
