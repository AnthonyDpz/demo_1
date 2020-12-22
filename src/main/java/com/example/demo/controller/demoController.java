package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demoController {
	
	@RequestMapping(value = {"", "/", "index", "/index", "index.*", "/index.*"})
	public String index() {
		return "home";
	}

}
