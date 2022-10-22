package com.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.dao.UserDao;
import com.register.entities.User;
@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user)
	{
			return this.userDao.saveUser(user);
		
	}

}
