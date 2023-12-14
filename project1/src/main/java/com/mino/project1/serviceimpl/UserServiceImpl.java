package com.mino.project1.serviceimpl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.mino.project1.service.*;
import com.mino.project1.vo.*;
import com.mino.project1.controller.UserController;
import com.mino.project1.mapper.*;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper usermapper;
	
	@Override
	public List<UserInfo> getUserList() {
		logger.info("[ UserServiceImpl getUserList ]");
		
		return usermapper.getUserList();
	}

	@Override
	public UserInfo loginChk(UserInfo User) {
		logger.info("[ UserServiceImpl loginChk ]");
		System.out.println(usermapper.getUserList());
		
		
		return usermapper.loginChk(User);
	}

}
