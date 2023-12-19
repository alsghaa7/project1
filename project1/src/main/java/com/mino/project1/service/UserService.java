package com.mino.project1.service;

import java.util.List;
import java.util.Map;

import com.mino.project1.vo.UserInfo;

public interface UserService {
	
	public List<UserInfo> getUserList();
	
	public Map<String, String> loginChk(Map<String, String> userInfo);

}
