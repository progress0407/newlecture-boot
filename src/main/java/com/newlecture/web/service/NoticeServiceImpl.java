package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeDao noticeDao;

	@Override
	public NoticeView getView(int id) {
		NoticeView notice = noticeDao.getView(id);
		return notice;
	}

	@Override
	public List<NoticeView> getViewList() {
		// TODO Auto-generated method stub
		return getViewList(1, "title", "");
	}

	@Override
	public List<NoticeView> getViewList(String field, String query) {
		// TODO Auto-generated method stub
		return getViewList(1, field, query);
	}
	
	@Override
	public List<NoticeView> getViewList(int page, String field, String query) {
		
		int size = 5;
		int offset = 0 + size * (page-1); // an = a1 + (n-1)d : page 1-> 0, 2-> 10, 3-> 20
		
		List<NoticeView> list = noticeDao.getViewList(offset, size, field, query);
		
		return list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return noticeDao.getCount("title", "");
	}

	@Override
	public int getCount(String field, String query) {
		// TODO Auto-generated method stub
		return noticeDao.getCount(field, query);
	}

	@Override
	public int updatePubAll(int[] pubIds, int[] closeIds) {
		// TODO Auto-generated method stub
		return noticeDao.updatePubAll(pubIds, closeIds);
	}

	@Override
	public int deletaAll(int[] ids) {
		// TODO Auto-generated method stub
		return noticeDao.deleteAll(ids);
	}

	@Override
	public Notice getNext(int id) {
		// TODO Auto-generated method stub
		return noticeDao.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		// TODO Auto-generated method stub
		return noticeDao.getPrev(id);
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.update(notice);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return noticeDao.delete(id);
	}

	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.insert(notice);
	}

}
