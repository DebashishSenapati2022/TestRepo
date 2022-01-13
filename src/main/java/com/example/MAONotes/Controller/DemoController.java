package com.example.MAONotes.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	private static final Logger log = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping("/")
	public String home() {

		log.info("Inside home call...");

		return "home controller";
	}

}
