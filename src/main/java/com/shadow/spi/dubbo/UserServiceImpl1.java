package com.shadow.spi.dubbo;

/**
 * @author shadow
 * @create 2020-08-29
 * @description
 */
public class UserServiceImpl1 implements UserService {
	@Override
	public void dubbo() {
		System.out.println("dubbo spi 1");
	}
}
