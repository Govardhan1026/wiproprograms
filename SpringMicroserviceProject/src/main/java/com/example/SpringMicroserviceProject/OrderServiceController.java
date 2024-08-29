package com.example.SpringMicroserviceProject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/order")
public class OrderServiceController {

	@PostMapping("/place")

	public String placeOrder(@RequestParam String productID) {

		return "Order placed for " + productID;

	}
}
