package com.springmybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmybatis.entity.User;
import com.springmybatis.mapping.UserMapper;
import com.springmybatis.service.UserService;

@Service(value="abc")
public class UserServiceImpl implements UserService{

	@Autowired(required = true)
	private UserMapper userMapper;	
	
	@Override
	public User queryAbc(int id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

}
