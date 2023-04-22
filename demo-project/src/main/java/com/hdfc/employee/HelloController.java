package com.hdfc.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/get")
	public String get() {
		return "Hello Everyone !";
	}

}
