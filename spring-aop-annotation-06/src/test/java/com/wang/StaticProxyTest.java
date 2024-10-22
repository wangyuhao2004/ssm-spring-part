package com.wang;

import com.wang.config.JavaConfig;
import com.wang.statics.StaticProxyCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * projectName: com.wang
 *
 * @Author: 王玉豪
 * @Date: 2024/10/17 19:03
 * @descriptions: 静态代理测试
 */

@SpringJUnitConfig(JavaConfig.class)
public class StaticProxyTest {

    @Autowired
    private Calculator calculator;

    //静态代理类
    @Autowired
    private StaticProxyCalculator staticProxyCalculator;

    @Test
    public void test_01() {
        staticProxyCalculator.add(2, 6);
        staticProxyCalculator.subtract(1,2);
        staticProxyCalculator.multiplication(3,6);
        staticProxyCalculator.division(3,4);
    }

}
