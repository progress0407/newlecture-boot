package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
	
	@Results({
		@Result(property = "memberName", column = "member_name"),
		@Result(property = "regdate", column = "reg_date"),
		@Result(property = "memberId", column = "member_id")
	})
	List<NoticeView> getViewList(int offset, int size, String field, String query);
	NoticeView getView(int id);
	int getCount(String field, String query);
	Notice getNext(int id);
	Notice getPrev(int id);
	
	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);
	
	int deleteAll(int[] ids);
//	int updatePubAll(int[] pubIds, int[] closeIds);
	int updatePubAll(int[] ids, boolean pub);
	
}
