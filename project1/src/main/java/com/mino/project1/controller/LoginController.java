package com.mino.project1.controller;

import com.mino.project1.vo.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mino.project1.service.UserService;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		return "login";
	}

	@RequestMapping(value = "/loginChk", method = RequestMethod.POST)
	@ResponseBody
	public String loginChk(Model model, @RequestBody String userInfo) {
		
		logger.info("[ loginChk ]");
		logger.info("userInfo: {}", userInfo);
		
		Map<String, String> user = new HashMap<String, String>();
		Map<String, String> convUserInfo = new HashMap<String, String>();
		
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			TypeReference<Map<String, String>> typeReference = new TypeReference<Map<String, String>>() {
			};

			convUserInfo = objectMapper.readValue(userInfo, typeReference);

			logger.info("conversionUserInfo: {}", convUserInfo);
			user = userService.loginChk(convUserInfo);
			logger.info("user: {}", user);
				
		} catch (Exception e) {
			e.getStackTrace();
		}	

		return "login_chk";
	}
}
