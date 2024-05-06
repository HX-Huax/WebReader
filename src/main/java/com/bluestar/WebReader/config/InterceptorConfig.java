package com.bluestar.WebReader.config;

import com.bluestar.WebReader.controller.Interceptor.JWTInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 此类用于配置应用程序的侦听器。
 * 它实现了 WebMvcConfigurer 接口，该接口提供了回调方法来自定义 Spring MVC 的基于 Java 的配置。
 */
public class InterceptorConfig implements WebMvcConfigurer {
    /**
     *此方法用于向应用程序添加侦听器。
     * 它重写 WebMvcConfigurer 接口中的 addInterceptors 方法。
     *
     * @param registry 将侦听器添加到的 InterceptorRegistry。
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 将新的 JWTInterceptor 添加到注册表中。
        // 拦截器将应用于除以 /user 开头的路径（排除）之外的所有路径 （/**）。
        registry.addInterceptor(new JWTInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/user/login", "/user/register");
    }
}