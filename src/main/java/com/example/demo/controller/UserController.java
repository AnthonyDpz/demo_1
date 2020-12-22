package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.repository.UserRepositoryInterface;

import com.example.demo.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepositoryInterface userRepository;
	
	
	
	public UserRepositoryInterface getUserRepository() {
		return userRepository;
	}
	
	public void setUserRepository(UserRepositoryInterface userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/List")
	public String userList(Model model) {
		model.addAttribute("users",userRepository.findAll());
		
		return "userList";
	}
	
	@GetMapping("/Fill")
	public String userFill(Model model) {
		userRepository.save(new User("john", "123"));
		userRepository.save(new User("Doe", "456"));
		userRepository.save(new User("Rambo", "789"));
		
		return "home";
	}
	

}
