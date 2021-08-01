package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	private static final String viewCommonPath = "/admin/board/notice/";
	
	@RequestMapping("list")
	public String list(Model model) {
		
		return viewCommonPath + "list" ;
	}

	@RequestMapping("detail")
	public String detail() {
		
		return viewCommonPath + "detail" ;
	}
	
	@RequestMapping("reg")
	public String edit() {
		
		return viewCommonPath + "reg" ;
	}
	
	@RequestMapping("edit")
	public String edit(Model edit) {
		
		return viewCommonPath + "edit" ;
	}
	
	@RequestMapping("del")
	public String del() {
		
		return viewCommonPath + "del" ;
	}
	
}
