package com.springmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmybatis.service.UserService;

@Controller
@RequestMapping(value= "/user")
public class TestBootController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/query",produces = {"application/json;charset=UTF-8"})
	public void findOne(@RequestParam String id) {
		userService.query(Integer.valueOf(id));
	}
}
