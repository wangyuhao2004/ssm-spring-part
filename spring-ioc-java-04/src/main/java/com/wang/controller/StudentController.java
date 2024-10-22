package com.wang.controller;

import com.wang.pojo.Student;
import com.wang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * projectName: com.wang.controller
 *
 * @Author: 王玉豪
 * @Date: 2024/10/16 21:50
 * @descriptions:
 */

@Controller
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    public void findAll() {
        List<Student> studentList = studentService.findAll();
        System.out.println(studentList);
    }
}
