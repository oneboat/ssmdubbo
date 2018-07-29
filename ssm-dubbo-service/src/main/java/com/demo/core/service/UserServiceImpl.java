package com.demo.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.core.bean.User;
import com.demo.core.dao.UserDao;
import com.demo.core.serive.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired //注入UserDao
	private UserDao userDao;
	
	@Override
	public User findById(String userid) {
		return userDao.findById(userid);
	}

}
