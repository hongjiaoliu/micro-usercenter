package com.microservice.demo.usercenter.service.controller;

import com.microservice.base.entity.common.ResultBean;
import com.microservice.base.entity.common.ResultError;
import com.microservice.base.entity.common.ResultSuccess;
import com.microservice.demo.usercenter.entity.User;
import com.microservice.demo.usercenter.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户服务控制器
 *
 * @author liuhongjao
 * @date 2019/4/26 13:16
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	UserService userService;

	/**
	* 查询一个用户
	* @param userID : 用户ID
	* @return:
	* @author:liuhongjiao
	* @date: 2019/4/26 14:44
	*/
	@GetMapping("/{id}")
	public ResultBean getUserByID(@PathVariable("id") Integer userID){
		if(userID == null){
			return new ResultError("USER-0001", "参数不合法");
		}
		User user = userService.findUserByID(userID);
		return new ResultSuccess(user);
	}

	/**
	*  删除一个用户
	* @param  userID : 用户ID
	* @return:
	* @author:liuhongjiao
	* @date: 2019/4/26 15:00
	*/
	@DeleteMapping("/{id}")
	public ResultBean deleteOneUser(@PathVariable("id") Integer userID){
		if(userID == null){
			return new ResultError("USER-0001", "参数不合法");
		}
		userService.deleteUserByID(userID);
		return new ResultSuccess();
	}

	/**
	*  更新一个用户
	* @param
	* @return:
	* @author:liuhongjiao
	* @date: 2019/4/26 15:02
	*/
	@PutMapping("/{id}")
	public ResultBean updateUser(@RequestBody User u,
								 @PathVariable("id") Integer userID){
		if(userID == null){
			return new ResultError("USER-0001", "参数不合法");
		}
		User user = userService.findUserByID(userID);
		if (user == null) {
			return new ResultError("USER-0002", "用户不存在!");
		}
		userService.updateUser(u,userID);
		return new ResultSuccess();
	}

	/**
	*  新增一个用户
	* @return:
	* @author:liuhongjiao
	* @date: 2019/4/26 15:03
	*/
	@PostMapping("")
	public ResultBean addOneUser(@RequestBody User u){
		userService.addOneUser(u);
		return new ResultSuccess();
	}

}
