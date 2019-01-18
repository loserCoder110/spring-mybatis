package com.springmybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmybatis.entity.User;
import com.springmybatis.mapper.UserMapper;
import com.springmybatis.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;	
	
	@Override
	public User query(int id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

}
