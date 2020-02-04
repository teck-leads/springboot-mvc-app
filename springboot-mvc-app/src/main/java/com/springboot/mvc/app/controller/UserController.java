package com.springboot.mvc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String getHome() {
		return "index";
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String getLogin(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "login";
	}
}
