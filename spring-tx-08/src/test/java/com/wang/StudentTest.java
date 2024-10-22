package com.wang;

import com.wang.configs.MyConfig;
import com.wang.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * projectName: com.wang
 *
 * @Author: 王玉豪
 * @Date: 2024/10/20 15:37
 * @descriptions:
 */

@SpringJUnitConfig(MyConfig.class)
public class StudentTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void test_01() {
        studentService.changeInfo();
    }
}
