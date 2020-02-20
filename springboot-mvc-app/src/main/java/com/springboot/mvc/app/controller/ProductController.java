package com.springboot.mvc.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.mvc.app.model.Product;

@Controller
public class ProductController {
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String prodRegPage(Model model) {
		
		Product prodcutDp1=new Product();
		List<String> list=new ArrayList<String>();
		list.add("DTNA");
		list.add("OWL");
		list.add("MBUSA");
		list.add("FCA");
		
		
		prodcutDp1.setProdBrnd(list);
		model.addAttribute("prodcutDp1",prodcutDp1);
		return "prodReg";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String prodRegPage(@ModelAttribute Product product, Model model) {
		
		model.addAttribute("product", product);
		return "prodDetails";
	}


}
