package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.NoticeView;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeDao noticeDao;

	@Override
	public List<NoticeView> getList(int page, String field, String query) {
		
//		int offset, int size, String field, String query
		
		int size = 5;
		int offset = 0 + size * (page-1); // an = a1 + (n-1)d : page 1-> 0, 2-> 10, 3-> 20
		
		List<NoticeView> list = noticeDao.getList(offset, size, field, query);
		
		return list;
	}

	@Override
	public NoticeView get(int id) {
		NoticeView notice = noticeDao.get(id);
		return notice;
	}

}
