package com.wang;

import com.wang.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * projectName: com.wang
 *
 * @Date: 2024/10/15 23:42
 * descriptions
 * @Author: 王玉豪
 */
public class ControllerTest {

    @Test
    public void testRun() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-01.xml");

        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.findAll();
    }
}
