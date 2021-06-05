package com.codixlabs.di.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codixlabs.di.model.User;

@RestController
@RequestMapping("hello")
public class Controller {
	
	public Controller() {
		System.out.println("Controller is created & injected");
	}
	
	@GetMapping("/{name}")
	String getDate(@PathVariable(name = "name") String name) {
		return "I am Getting Data Properly "+ name;
	}
	
	@GetMapping
	String getData(@RequestParam(name = "first_name") String firstName, @RequestParam(name = "last_name") String lastName ) {
		return "I am Getting Data Properly "+ firstName + " "+lastName;
	}
	
	@PostMapping
	String postSomeData(@RequestBody User someData) {
		return "I am Posting Data Properly "+ someData.first_name + " "+ someData.last_name;
	}
}
