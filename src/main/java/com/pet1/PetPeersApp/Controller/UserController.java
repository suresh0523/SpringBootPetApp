package com.pet1.PetPeersApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pet1.PetPeersApp.Model.UserRegistration;
import com.pet1.PetPeersApp.Service.UserService;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public String saveUser(@RequestBody UserRegistration userRegistration) {
		
		return userService.addUser(userRegistration);
		
		//return "added ";
	}
	
	@PostMapping("/user/authenticate")
	public String authenticateUser(@RequestParam("userName") String username , @RequestParam("password") String password) {
		return userService.userAuthentication(username, password);
	

}

}
