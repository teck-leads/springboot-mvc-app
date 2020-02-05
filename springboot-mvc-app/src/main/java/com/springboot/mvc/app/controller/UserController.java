package com.springboot.mvc.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.mvc.app.service.UserService;

@Controller
public class UserController {
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
}
