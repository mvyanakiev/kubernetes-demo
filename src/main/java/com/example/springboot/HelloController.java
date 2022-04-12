package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
public class HelloController {

	private static final String uid = UUID.randomUUID().toString();

	private static int count = 0;

	@GetMapping("/")
	public String index() throws InterruptedException {
		return "<h1>Version 2</h1></br>" + ++count + " Greetings from ICS! </br> InstanceID = " + uid;
	}

}
