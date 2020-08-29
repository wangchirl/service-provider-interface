package com.shadow.spi;

import com.shadow.spi.dubbo.UserService;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author shadow
 * @create 2020-08-29
 * @description
 * Dubbo SPI机制：
 * 1、接口
 * 2、接口具体实现类
 * 3、META-INF/dubbo/接口全类名 或 META-INF/dubbo/internal/接口全类名 二选一，或者是 META-INF/services/接口全类名
 * 4、接口全类型写入具体的实现类，每一个实现类取一个name
 * 5、@SPI 注解 与 @Adaptive
 * 6、ExtensionLoader
 */
public class DubboSPI {
	public static void main(String[] args) {
		ExtensionLoader<UserService> extensionLoader = ExtensionLoader.getExtensionLoader(UserService.class);
		extensionLoader.getDefaultExtension().dubbo(); // @SPI("user2")
		extensionLoader.getExtension("user1").dubbo();
	}
}
