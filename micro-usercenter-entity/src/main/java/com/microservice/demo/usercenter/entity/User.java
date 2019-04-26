package com.microservice.demo.usercenter.entity;

/**
 * 用户实体
 *
 * @author liuhongjao
 * @date 2019/4/26 13:45
 */

public class User {

	Integer id;
	String name;
	String  mobile;
	String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
