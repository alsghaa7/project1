package com.mino.project1.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.mino.project1.service.*;
import com.mino.project1.vo.*;
import com.mino.project1.mapper.*;

@Service
public class UserServiceImpl implements Test{

	  @Autowired(required=false)
	  private UserMapper usermapper;
	  
	  @Override 
	  public List<UserInfo> getUserList() { 
		  System.out.print("----serviceimpl------");
		  return usermapper.getUserList(); 
	  }
	 
	
}
