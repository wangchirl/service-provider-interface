package com.shadow.spi;

import com.shadow.spi.spring.AbstractAccountService;
import com.shadow.spi.spring.UserService;
import org.springframework.core.io.support.SpringFactoriesLoader;

import javax.swing.*;
import java.util.List;

/**
 * @author shadow
 * @create 2020-08-29
 * @description
 * Spring SPI机制：
 * 1、接口或抽象类
 * 2、接口/抽象类具体实现类
 * 3、META-INF/spring.factories
 * 4、spring.factories文件写入具体的 key 为 接口名称，value 为接口具体实现类，多个以英文逗号隔开
 * 5、SpringFactoriesLoader
 */
public class SpringSPI {
	public static void main(String[] args) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		// 接口
		List<UserService> userServices = SpringFactoriesLoader.loadFactories(UserService.class, classLoader);
		userServices.forEach(UserService::spring);
		// 抽象类
		List<AbstractAccountService> abstractAccountServices = SpringFactoriesLoader.loadFactories(AbstractAccountService.class, classLoader);
		abstractAccountServices.forEach(AbstractAccountService::springAbs);
	}
}
