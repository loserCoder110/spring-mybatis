package com.springmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmybatis.entity.User;
import com.springmybatis.service.UserService;

@RestController
@RequestMapping(value= "/user")
public class TestBootController {
	
	@Autowired(required = true)
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/query",produces = {"application/json;charset=UTF-8"})
	public User findOne(@RequestParam String id) {
		System.out.println("sadfafgagfag----------------");
		return userService.queryAbc(Integer.valueOf(id));
	}
}
