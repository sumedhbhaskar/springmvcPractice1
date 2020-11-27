package com.qikoo.springmvcController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qikoo.springmvcController.model.User;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String Home() {
		return "index";
	}

	@RequestMapping("/adduser")
	public String adduser(@ModelAttribute("result") User user){
		
		return "result";
	}
	
	@RequestMapping("/finduser")
	public String finduser(Model m) {
		m.addAttribute("result", "trying to find the result!!");
		return "result";
	}
	
}
