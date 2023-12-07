package com.mino.project1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.mino.project1.vo.*;


@Mapper
public interface UserMapper {
	
	  @Select("select * from user") 
	  public List<UserInfo> getUserList();
	 
}
