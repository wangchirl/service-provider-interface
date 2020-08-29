package com.shadow.spi;

import com.shadow.spi.spring.UserService;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

/**
 * @author shadow
 * @create 2020-08-29
 * @description
 * Spring SPI机制：
 * 1、接口
 * 2、接口具体实现类
 * 3、META-INF/spring.factories
 * 4、spring.factories文件写入具体的 key 为 接口名称，value 为接口具体实现类，多个以英文逗号隔开
 * 5、SpringFactoriesLoader
 */
public class SpringSPI {
	public static void main(String[] args) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		List<UserService> userServices = SpringFactoriesLoader.loadFactories(UserService.class, classLoader);
		userServices.forEach(UserService::spring);
	}
}
