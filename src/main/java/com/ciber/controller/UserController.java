package com.ciber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ciber.dao.UserRepo;
import com.ciber.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/addUser")
	public String addUser(User user) {
		
		userRepo.save(user);
		return "home.jsp";
	}

}
