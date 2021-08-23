package com.helloworld.exercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Objetivo de Aprendizagem: Aprender a utilizar o Sprint Boot.";
	}
}

