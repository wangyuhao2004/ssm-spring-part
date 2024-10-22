package com.wang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * projectName: com.wang.config
 *
 * @Author: 王玉豪
 * @Date: 2024/10/18 12:32
 * @descriptions: 配置类
 */

@Configuration
@ComponentScan(value = "com.wang")
@EnableAspectJAutoProxy  //开启aspectj的注解
public class JavaConfig {
}
