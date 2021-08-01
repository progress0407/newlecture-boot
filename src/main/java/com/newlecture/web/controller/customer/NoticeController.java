package com.newlecture.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@RequestMapping("list")
	public String list(Model model) {
		
		// /customer/notice/list.jsp 경로가 우연히 같으면 생략해도 된다
		model.addAttribute("test", "Hello~~ Devtools");
		
		return "list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "detail";
	}
}
