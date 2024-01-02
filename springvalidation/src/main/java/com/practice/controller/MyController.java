package com.practice.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.entites.LoginData;

@Controller
public class MyController {
	
	@GetMapping("/form")
	public String openForm(Model model)
	{
		System.out.println("opening form");
		
		model.addAttribute("loginData",new LoginData())
		;
		return "form";
	}
	
	//hander for proces form
	@PostMapping("/process")
	public String procesForm(@Valid @ModelAttribute("loginData")
	LoginData loginData,BindingResult result) {
		
		System.out.println(loginData);
		
		if(result.hasErrors()) {
			
			System.out.println(result);
		}
		return "success";
	}
	
	
	
	
	
}
