package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping("/auto")
	public String v1() {
		String s1="Manoj chakravarthi";
		String  s=s1.toLowerCase();
		String s2=s.toUpperCase();
		return s2;
	}
	
	

}
