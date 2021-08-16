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
	public List<NoticeView> getList() {
		
		List<NoticeView> list = noticeDao.getList();
		
		return list;
	}

	@Override
	public NoticeView get(int id) {
		NoticeView notice = noticeDao.get(id);
		return notice;
	}

}
