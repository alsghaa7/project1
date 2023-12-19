package com.mino.project1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import com.mino.project1.vo.*;

@Mapper
public interface UserMapper {
	
//	public List<Map<String, String>> getUserList();
	public List<UserInfo> getUserList();
	
	public Map<String, String> loginChk(Map<String, String> userInfo);
	
}
