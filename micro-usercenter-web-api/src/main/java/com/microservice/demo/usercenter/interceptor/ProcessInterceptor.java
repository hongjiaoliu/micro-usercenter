package com.microservice.demo.usercenter.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 访问拦截器——用于解决跨域问题
 * @author liuhongjao
 * @date 2019/5/9 15:07
 */

@Component
public class ProcessInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));

		response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Accept,X-Requested-With");
		response.setHeader("Access-Control-Allow-Methods","GET, PUT, POST, DELETE, OPTIONS");

		response.setHeader("Access-Control-Allow-Credentials", "true");

		response.setHeader("Access-Control-Max-Age", "43200");

		String method= request.getMethod();

		if (method.equals("OPTIONS")){
			response.setStatus(200);
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}
}
