package com.microservice.demo.usercenter.service.service.impl;

import com.microservice.demo.usercenter.entity.User;
import com.microservice.demo.usercenter.service.mapper.UserMapper;
import com.microservice.demo.usercenter.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户服务实现类
 *
 * @author liuhongjao
 * @date 2019/4/26 14:21
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	/**
	 * 通过用户ID获取一个用户
	 *
	 * @param userID
	 * @return
	 */
	@Override
	public User findUserByID(Integer userID) {
		return userMapper.findUserByID(userID);
	}

	/**
	 * 添加一个用户
	 *
	 * @param u
	 */
	@Override
	@Transactional
	public void addOneUser(User u) {
		userMapper.addOneUser(u);
	}

	/**
	 * 删除一个用户
	 *
	 * @param userID
	 */
	@Override
	@Transactional
	public void deleteUserByID(Integer userID) {
		userMapper.deleteUserByID(userID);
	}

	/**
	 * 更新一个用户
	 *
	 * @param u
	 * @param id
	 */
	@Override
	@Transactional
	public void updateUser(User u, Integer id) {
		userMapper.updateUser(u,id);
	}
}
