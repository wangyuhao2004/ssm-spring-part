package com.wang.controller;

import com.wang.pojo.Student;
import com.wang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * projectName: com.wang.controller
 *
 * @Date: 2024/10/16 17:56
 * descriptions
 * @Author: 王玉豪
 */

@Controller
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    public void findAll() {
        List<Student> studentList = this.studentService.findAll();
        System.out.println(studentList);
    }

}
