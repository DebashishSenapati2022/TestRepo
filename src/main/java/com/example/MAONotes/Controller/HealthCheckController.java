package com.bbby.eom.customervisibility.workbench.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
	
	@GetMapping(value = "/healthCheck")
	public ResponseEntity<?> healthCheck(){
		return new ResponseEntity<>("Application is up and running" , HttpStatus.OK);
	}

}
