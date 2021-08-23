package com.halloword.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HalloController {
	
	@GetMapping("/hallo")
	public String sayhallo() {
		return "Hallo World! Meu primeiro projeto Spring ";
	}
	@GetMapping("/bye")
	public String saybye() {
		return "Bye World! Encerrando meu primeiro projeto Spring ";
	}
}
