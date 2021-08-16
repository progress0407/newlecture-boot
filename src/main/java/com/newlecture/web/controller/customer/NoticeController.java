package com.newlecture.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	private static final String viewCommonPath = "customer.notice.";
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		List<NoticeView> list = service.getList();
		
		// /customer/notice/list.jsp 경로가 우연히 같으면 생략해도 된다
		model.addAttribute("list", list);
		
		return viewCommonPath + "list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return viewCommonPath + "detail";
	}
}
