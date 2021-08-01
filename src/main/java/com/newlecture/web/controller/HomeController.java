package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HomeController {

	@RequestMapping("/customer/notice/list")
	public String list(Model model) {
		
		// /customer/notice/list.jsp 경로가 우연히 같으면 생략해도 된다
		model.addAttribute("test", "Hello~~ Model");
		
		return "list.jsp";
	}
	
	@RequestMapping("/customer/notice/detail")
	public String detail() {
		return "";
	}
	
    @RequestMapping("/index")
    public String foo() {
    	return "Hello Spring Boot by Maven";
    }

    @RequestMapping("/boo")
    public String boo() {
    	return "nothing";
    }

}