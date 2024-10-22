package com.wang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * projectName: com.wang.config
 *
 * @Author: 王玉豪
 * @Date: 2024/10/17 18:56
 * @descriptions: 配置类
 */

@Configuration
@ComponentScan(value = {"com.wang","com.wang.statics"})
public class JavaConfig {
}
