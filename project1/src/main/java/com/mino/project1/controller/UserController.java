package com.mino.project1.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mino.project1.vo.*;
import com.mino.project1.serviceimpl.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	  @Autowired(required=false)
	  private UserServiceImpl userService;
	  
	  @ResponseBody
	  @RequestMapping(value = "/test", method = RequestMethod.GET) 
	  public Map<String, Object> test() {
		  System.out.print("------1----");
		  Map<String, Object> map = new HashMap<>();
		  System.out.print("-----2-----");
		  List<UserInfo> users = userService.getUserList();
		  System.out.print("------3----");
		  map.put("list", users);
		  if (users == null) {
			  System.out.print("null");
		  } else {
			  System.out.print(users);
		  }
		  
		  return map; 
	  }
	  
}
