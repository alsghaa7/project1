package com.mino.project1.controller;

import java.util.List;
import java.util.Map;

import com.mino.project1.vo.*;
import com.mino.project1.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public List<UserInfo> getUserList(Model model) {
		logger.info("[ UserController /test ]");
		List<UserInfo> users = userService.getUserList();
//		List<Map<String, String>> users = userService.getUserList();
		
		logger.info("Users: {}", users);
		
		return users;
	}

}
