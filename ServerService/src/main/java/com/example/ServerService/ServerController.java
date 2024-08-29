package com.example.ServerService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Server Service";
	}
}