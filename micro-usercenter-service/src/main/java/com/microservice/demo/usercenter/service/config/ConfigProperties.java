package com.microservice.demo.usercenter.service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class ConfigProperties implements Serializable {

	private static final long serialVersionUID = 3158439972759918879L;

	@Value("${jdbc.driver}")
	protected String driver;

	@Value("${jdbc.url}")
	protected String url;

	@Value("${jdbc.username}")
	protected String username;

	@Value("${jdbc.password}")
	protected String password;

	@Value("${spring.redis.host}")
	protected String redisHost;

	@Value("${spring.redis.port}")
	protected String redisPort;

	@Value("${spring.redis.password}")
	protected String redisPassword;

	/**
	 * @return the driver
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * @param driver the driver to set
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String getRedisHost() {
		return redisHost;
	}

	public void setRedisHost(String redisHost) {
		this.redisHost = redisHost;
	}

	public String getRedisPort() {
		return redisPort;
	}

	public void setRedisPort(String redisPort) {
		this.redisPort = redisPort;
	}

	public String getRedisPassword() {
		return redisPassword;
	}

	public void setRedisPassword(String redisPassword) {
		this.redisPassword = redisPassword;
	}

}
