package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HomeController {
	
	private static final String viewCommonPath = "home.";

    @RequestMapping("/index")
    public String foo() {
    	return viewCommonPath + "index";
    }
    
    @RequestMapping("/help")
    public String boo() {
    	return viewCommonPath + "help";
    }

}