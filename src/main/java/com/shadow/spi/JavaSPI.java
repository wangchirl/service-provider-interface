package com.shadow.spi;

import com.shadow.spi.java.AbstractAccountService;
import com.shadow.spi.java.UserService;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author shadow
 * @create 2020-08-29
 * @description
 * JAVA SPI机制：
 * 1、接口或抽象类
 * 2、接口/抽象类具体实现类
 * 3、META-INF/services/接口全类名
 * 4、接口全类名写入具体接口实现类，多个换行处理
 * 5、ServiceLoader
 */
public class JavaSPI {
	public static void main(String[] args) {
		// 接口
		ServiceLoader<UserService> services = ServiceLoader.load(UserService.class);
		Iterator<UserService> iterator = services.iterator();
		while (iterator.hasNext()) {
			UserService userService = iterator.next();
			userService.java();
		}
		// 抽象类
		ServiceLoader<AbstractAccountService> services1 = ServiceLoader.load(AbstractAccountService.class);
		Iterator<AbstractAccountService> iterator1 = services1.iterator();
		while (iterator1.hasNext()) {
			AbstractAccountService abstractAccountService = iterator1.next();
			abstractAccountService.javaAbs();
		}
	}
}
