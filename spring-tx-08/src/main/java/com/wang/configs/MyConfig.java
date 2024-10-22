package com.wang.configs;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * projectName: com.wang.configs
 *
 * @Author: 王玉豪
 * @Date: 2024/10/20 15:07
 * @descriptions: 配置类
 */

@Configuration
@ComponentScan("com.wang")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement //开启事务管理器注解
public class MyConfig {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DruidDataSource dataSource() {

        DruidDataSource dataSource =
                new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;

    }

    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    /**
     * 装配事务管理器对象
     * @param dataSource
     * @return
     */
    @Bean
    public TransactionManager transactionManager(DataSource dataSource) {

        DataSourceTransactionManager dataSourceTransactionManager
                = new DataSourceTransactionManager();

        dataSourceTransactionManager.setDataSource(dataSource);

        return dataSourceTransactionManager;
    }

}
