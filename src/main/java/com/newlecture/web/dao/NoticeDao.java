package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
	
	@Results({
		@Result(property = "memberName", column = "member_name"),
		@Result(property = "regdate", column = "reg_date"),
		@Result(property = "memberId", column = "member_id")
	})
	@Select("select * from NoticeView "
			+ "where ${field} like '%${query}%' "
			+ "order by id desc "
			+ "limit #{offset}, #{size}")
	List<NoticeView> getList(int offset, int size, String field, String query);
	NoticeView get(int id);
}
