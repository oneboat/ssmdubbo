package com.demo.core.dao;

import com.demo.core.bean.User;

public interface UserDao {
	//根据id查询
	public User findById(String userid);
}
