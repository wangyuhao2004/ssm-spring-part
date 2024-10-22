package com.wang;

import com.wang.components.A;
import com.wang.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * projectName: com.wang
 *
 * @Author: 王玉豪
 * @Date: 2024/10/17 13:31
 * @descriptions:
 */
/*
    @SpringJUnitConfig能够帮我们直接创建ioc容器
        //@SpringJUnitConfig( value = 配置类)
        //@SpringJUnitConfig( locations = 指定配置文件.xml)
* */
@SpringJUnitConfig(value = JavaConfig.class)
public class SpringIoCTest {

    @Autowired
    private A a;

    @Test
    public void test_01() {
        System.out.println(a);
    }
}
