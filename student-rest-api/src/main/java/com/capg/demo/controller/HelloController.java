package com.capg.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    
	
	@RequestMapping("hello")
	public String sayHello()
	  {
		  return "welcome";
	  }
	
	
	
	
}
