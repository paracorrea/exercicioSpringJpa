package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroControler {
	
	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	public String ola() {
		return "Olá Spring Boot!";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/saudacao")
	public String saudacao() {
		return "Saudação Spring Boot!";
	}

}
