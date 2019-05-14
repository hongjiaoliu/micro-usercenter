package com.microservice.demo.usercenter.service.service.impl;

import com.github.pagehelper.PageRowBounds;
import com.microservice.base.entity.common.ResultBean;
import com.microservice.base.entity.common.ResultSuccess;
import com.microservice.demo.usercenter.entity.User;
import com.microservice.demo.usercenter.service.mapper.UserMapper;
import com.microservice.demo.usercenter.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
	 * 通过关键字搜索用户列表（分页查询）
	 *
	 * @param keyWord
	 * @param pageSize
	 * @param page
	 * @return
	 */
	@Override
	public ResultBean searchUserLists(String keyWord, Integer pageSize, Integer page) {
		ResultSuccess success = new ResultSuccess();
		int offSet = ( page- 1 ) * pageSize;
		PageRowBounds pageRowBounds =
				new PageRowBounds(offSet, pageSize);
		List<User> users = userMapper.searchUsers(keyWord, pageRowBounds);
		success.setTotalCounts(pageRowBounds.getTotal().intValue());//获取总条数，避免单独再查询一次总数
		success.setResult(users);
		return success;
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
