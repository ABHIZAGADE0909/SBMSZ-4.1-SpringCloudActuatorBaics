package com.abhay.sb.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/emp")
public class EmployeeRestController {
	
	
	@GetMapping("/msg")
	public String getMsg()
	{
		
		return  "Hi Team";
	}
	
	
	@GetMapping("/show")
	public ResponseEntity<String> showMsg() {
		return ResponseEntity.ok("Hello");
	}

}
