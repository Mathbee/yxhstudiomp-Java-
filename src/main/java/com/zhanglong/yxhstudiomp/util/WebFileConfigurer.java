package com.zhanglong.yxhstudiomp.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 文件访问虚拟路径
 */
@Configuration
public class WebFileConfigurer implements WebMvcConfigurer {

	@Value("${produceimgPath}")
	private String produceimgPath;

	@Value("${proimgimgPath}")
	private String proimgimgPath;

	/**
	 * 重写addResourceHandlers方法映射文件路径，使能够访问静态资源
	 * 静态资源以链接的方法显示在浏览器中
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/produce/**").addResourceLocations(produceimgPath);
		registry.addResourceHandler("/proimg/**").addResourceLocations(proimgimgPath);
	}

}
