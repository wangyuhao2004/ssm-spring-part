package com.wang;

import com.wang.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * projectName: com.wang
 *
 * @Date: 2024/10/16 18:05
 * descriptions 注解方式配置ioc容器的测试类
 * @Author: 王玉豪
 */
public class AnnotationTest {

    @Test
    public void test_01() {

       ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-01.xml");
        StudentController studentController = applicationContext.getBean(StudentController.class);
        System.out.println(studentController);
    }

    @Test
    public void test_02() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-01.xml");
        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.findAll();
    }
}
