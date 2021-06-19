package com.drycleaning.service;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drycleaning.bean.User;
import com.drycleaning.dao.IUserRepository;
import com.drycleaning.dao.QueryClassPersisitContext;



@Service
@Transactional
public class UserServiceImpl {
List<User> le;
	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	QueryClassPersisitContext qcp;
	
	public List<User> getUser()
	{
		le=new ArrayList<>();
		le=userRepository.findAll();
		return le;
	}

	public User addUser(User ls){
		User e1=userRepository.save(ls);
		return e1;
	}
	public User removeUser(User user) {
		
		User user2 = qcp.findByUserName(user.getUserId());
		userRepository.delete(user2);
		return user2;
	}
	
	

}


