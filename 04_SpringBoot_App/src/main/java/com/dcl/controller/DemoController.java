package com.dcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/Demo")
	public String Demo() {
		return "Welcome to my home";
	}

}
