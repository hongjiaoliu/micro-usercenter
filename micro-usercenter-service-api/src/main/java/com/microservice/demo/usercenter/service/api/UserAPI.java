package com.microservice.demo.usercenter.service.api;

import com.microservice.base.entity.common.ResultBean;
import com.microservice.demo.usercenter.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * 用户接口
 *
 * @author:liuhongjiao
 * @date: 2019/4/26 15:48
 */
@FeignClient("usercenter-srv")
@Service
@RequestMapping("user")
public interface UserAPI {
	/**
	 * 查询一个用户
	 * @param userID : 用户ID
	 * @return:
	 * @author:liuhongjiao
	 * @date: 2019/4/26 14:44
	 */
	@GetMapping("/{id}")
	public ResultBean getUserByID(@PathVariable("id") Integer userID);


	/**
	 *  删除一个用户
	 * @param  userID : 用户ID
	 * @return:
	 * @author:liuhongjiao
	 * @date: 2019/4/26 15:00
	 */
	@DeleteMapping("/{id}")
	public ResultBean deleteOneUser(@PathVariable("id") Integer userID);

	/**
	 *  更新一个用户
	 * @param
	 * @return:
	 * @author:liuhongjiao
	 * @date: 2019/4/26 15:02
	 */
	@PutMapping("/{id}")
	public ResultBean updateUser(@RequestBody User u,
								 @PathVariable("id") Integer userID);

	/**
	 *  新增一个用户
	 * @return:
	 * @author:liuhongjiao
	 * @date: 2019/4/26 15:03
	 */
	@PostMapping("")
	public ResultBean addOneUser(@RequestBody User u);
}
