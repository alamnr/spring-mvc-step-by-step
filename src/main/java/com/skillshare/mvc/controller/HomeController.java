package com.skillshare.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	/*@RequestMapping("/home")
	@ResponseBody
	public String goHome() {
		return "Welcome Home";
	}*/
	
	
	@RequestMapping("/home")
	public String goHome() {
		return "home";
	}

}
