package com.example.SpringMicroserviceProject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductServiceController {

	@RequestMapping("/{id}")
	public String getProduct(@PathVariable String id) {
		return "Product ID: " + id;
	}
}
