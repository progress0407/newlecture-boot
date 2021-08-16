package com.newlecture.web.controller.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	private static final String viewCommonPath = "admin.board.notice.";
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		List<NoticeView> list = service.getList();
		
		return viewCommonPath + "list" ;
	}

	@RequestMapping("detail")
	public String detail() {
		
		NoticeView notice = service.get(1);
		
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
