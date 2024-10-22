package com.wang;

import com.wang.config.StudentConfiguration;
import com.wang.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * projectName: com.wang
 *
 * @Author: 王玉豪
 * @Date: 2024/10/16 21:54
 * @descriptions:
 */

public class JavaConfigurationTest {

    @Test
    public void test_01() {
        //根据配置类创建ioc容器
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(StudentConfiguration.class);

        //获取bean
        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.findAll();
    }
}
