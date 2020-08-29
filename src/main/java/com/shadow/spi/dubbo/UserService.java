package com.shadow.spi.dubbo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author shadow
 * @create 2020-08-29
 * @description
 */
@SPI("user2")
public interface UserService {
	void dubbo();
}
