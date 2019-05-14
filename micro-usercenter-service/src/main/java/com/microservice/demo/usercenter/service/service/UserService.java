package com.microservice.demo.usercenter.service.service;

import com.microservice.base.entity.common.ResultBean;
import com.microservice.demo.usercenter.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * ${DESCRIPTION}
 *
 * @author:liuhongjiao
 * @date: 2019/4/26 14:21
 */
public interface UserService {
	/**
	 * 通过用户ID获取一个用户
	 * @param userID
	 * @return
	 */
	User findUserByID(@Param("id") Integer userID);

	/**
	 * 通过关键字搜索用户列表（分页查询）
	 * @param keyWord
	 * @param pageSize
	 * @param page
	 * @return
	 */
	ResultBean searchUserLists(String keyWord, Integer pageSize, Integer page);

	/**
	 * 添加一个用户
	 * @param u
	 */
	void addOneUser(@Param("u") User u);

	/**
	 * 删除一个用户
	 * @param userID
	 */
	void deleteUserByID(@Param("id") Integer userID);

	/**
	 * 更新一个用户
	 * @param u
	 */
	void updateUser(@Param("u") User u,@Param("id") Integer id);

}
