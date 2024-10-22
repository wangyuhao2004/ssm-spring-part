package com.wang.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * projectName: com.wang.config
 * @Date: 2024/10/16 21:23
 * @Author: 王玉豪
 * @descriptions java的配置类,代替xml配置文件
 *               1.包扫描注解配置
 *               2.引用外部文件的注解配置
 *               2.声明第三方依赖的bean组件
 */

/*
    1.添加@Configuration注解,代表该类为配置类
    2.添加@ComponentScan注解,代替扫描包配置
    3.添加@PropertySource注解,代替引入外部文件配置
* */
@Configuration
@ComponentScan({"com.wang.dao","com.wang.pojo","com.wang.controller","com.wang.service"})
@PropertySource("classpath:jdbc.properties")
public class StudentConfiguration {

    //通过@value注解,读取外部配置文件里面的属性值,赋值给变量
    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;


    //采用bean注解代替xml文件当中配置的DruidDataSource的bean标签
    @Bean(name = "dataSource")
    public DruidDataSource dataSource() {

        DruidDataSource dataSource =
                new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }


    @Bean(name = "jdbcTemplate")
    public JdbcTemplate jdbcTemplate(DruidDataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
