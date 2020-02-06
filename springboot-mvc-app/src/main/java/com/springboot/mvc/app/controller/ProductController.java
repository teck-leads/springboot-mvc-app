package com.springboot.mvc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.mvc.app.model.Product;

@Controller
public class ProductController {
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String prodRegPage() {
		return "prodReg";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String prodRegPage(@ModelAttribute Product product, Model model) {
		
		model.addAttribute("product", product);
		return "prodDetails";
	}


}
