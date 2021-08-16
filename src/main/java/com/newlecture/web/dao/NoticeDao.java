package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
	
	@Select("select * from noticeview")
	List<NoticeView> getList();
	
	NoticeView get(int id);
}
