package com.microservice.demo.usercenter.service.mapper;

import com.github.pagehelper.PageRowBounds;
import com.microservice.demo.usercenter.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户表数据操作接口
 *
 * @author:liuhongjiao
 * @date: 2019/4/26 13:43
 */
@Repository
public interface UserMapper {
	/**
	 * 通过用户ID获取一个用户
	 * @param userID
	 * @return
	 */
	User findUserByID(@Param("id") Integer userID);

	/**
	 * 通过关键字分页查询用户
	 * @param keyWords
	 * @param pageRowBounds
	 * @return
	 */
	List<User> searchUsers(@Param("keyWords") String keyWords, PageRowBounds pageRowBounds);

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
