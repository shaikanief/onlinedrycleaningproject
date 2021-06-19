package com.drycleaning.service;

import org.springframework.http.HttpStatus;

import com.drycleaning.bean.User;

public interface IUserService {
	
	  HttpStatus validateUser(String username, String password) throws Exception;
	  public User addUser(User user);
	  
	  public User removeUser(User user);
	 
}
