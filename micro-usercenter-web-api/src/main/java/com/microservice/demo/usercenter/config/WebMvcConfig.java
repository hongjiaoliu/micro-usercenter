package com.microservice.demo.usercenter.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Component
public class WebMvcConfig extends WebMvcConfigurationSupport {

	/**
	 * 自定义RequestMappingHandlerMapping
	 * @return
	 */
	@Override
	protected RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
		return new FeignFilterRequestMappingHandlerMapping();
	}

	private static class FeignFilterRequestMappingHandlerMapping extends RequestMappingHandlerMapping {
		@Override
		protected boolean isHandler(Class<?> beanType) {
			return super.isHandler(beanType) && (AnnotationUtils.findAnnotation(beanType, FeignClient.class) == null);
		}
	}

}
