package com.springboot.mvc.app.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.mvc.app.model.User;
import com.springboot.mvc.app.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	private List<User> users=new ArrayList<>();
	{
		users.add(new User(12l,"madhav","India"));
		users.add(new User(13l,"teja","India"));
		users.add(new User(14l,"dill","USA"));
	}
	@Autowired
	private UserService service;

	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String getHome() {
		return "index";
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String getLogin(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "login";
	}
	
	@RequestMapping(value = "/data",method = RequestMethod.GET)
	public String getData(Model model) {
		model.addAttribute("name", "madhav");
		model.addAttribute("spouse", "Teja");
		//////////////////////
		List<String> list=new ArrayList<String>();
		
		list.add("madhav");
		list.add("Teja");
		list.add("Lakshmi");
		list.add("Anand");
		list.add("ram");
		model.addAttribute("list",list);
		///////////////////////////
		service.getUser(model);
		service.getUserList(model);
		
		return "data";
	}
	
	@RequestMapping(value = "/regusr",method = RequestMethod.GET)
	public String getReg() {
		return "registerUser";
	}
	
	
	@RequestMapping(value = "/getusr",method = RequestMethod.GET)
	public String getUsers(Model model) {
		model.addAttribute("users", users);
		return "userDetails";
	}
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public String deleteUser(@RequestParam("id") Long id) {
			
			
		Iterator<User> itr=users.iterator();
			while (itr.hasNext()) {
				if (itr.next().getId() == id) {
					itr.remove();
					break;
				}
			}
					
		
		
		
		return "redirect:getusr";
	}
}
