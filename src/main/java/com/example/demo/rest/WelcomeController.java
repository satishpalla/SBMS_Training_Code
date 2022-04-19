package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping({"/welcome1"})
	public String run1()
	{
		
		return "Welcome Sharwan";
	}
}
