package com.assignment.dockerspringdemo_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoDocker {

	// GET HTTP Method
	// http://localhost:8080/hello-world
	@GetMapping("/hello-world")
	@ResponseBody
	public String helloWorld() {
		return "Hello World!";
	}

}
