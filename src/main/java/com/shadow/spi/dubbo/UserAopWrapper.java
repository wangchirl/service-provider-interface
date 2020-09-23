package com.shadow.spi.dubbo;

import org.apache.catalina.User;

/**
 * @author shadow
 * @create 2020-09-23
 * @description
 *
 * Dubbo AOP：SPI
 * Dubbo IOC：@Adaptive + org.apache.dubbo.common.URL
 */
public class UserAopWrapper implements UserService {

	UserService userService;

	public UserAopWrapper(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void dubbo() {
		System.out.println("before");
		userService.dubbo();
		System.out.println("after");
	}
}
