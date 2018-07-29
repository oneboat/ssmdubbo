package com.demo.core.serive;

import com.demo.core.bean.User;

public interface UserService {
	//根据id查询
	public User findById(String userid);
}
