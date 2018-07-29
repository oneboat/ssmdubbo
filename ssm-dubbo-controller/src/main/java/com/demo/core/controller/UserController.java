package com.demo.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.core.bean.User;
import com.demo.core.serive.UserService;

@Controller
public class UserController {
	@RequestMapping(value="/index")
	public String index(){
		return "index";
	}
	
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user")
	public String testDubbo(Model model, @RequestParam String userId) {
		User findById = userService.findById(userId);
		//返回添加到前端
		model.addAttribute("user", findById);
		
		return "userDubbo";//testDubbo是前端页面testDubbo.jsp
	}
}
