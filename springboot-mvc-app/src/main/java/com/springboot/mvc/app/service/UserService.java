package com.springboot.mvc.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.springboot.mvc.app.model.User;

@Service
public class UserService {

	
	public void getUser(Model model) {
		User user = new User();
		user.setId(1002187L);
		user.setName("Teja");
		user.setCountry("India");
		model.addAttribute("user", user);
	}
	
	public void getUserList(Model model) {
		
		List<User> users=new ArrayList<User>();
		User user1 = new User();
		user1.setId(1002187L);
		user1.setName("Teja");
		user1.setCountry("India");
		users.add(user1);
		User user = new User();
		user.setId(1271265L);
		user.setName("madhav");
		user.setCountry("India");
		users.add(user);
		
		model.addAttribute("users", users);
	}


}
