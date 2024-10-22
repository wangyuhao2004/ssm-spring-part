package com.wang.controller;

import com.wang.pojo.Student;
import com.wang.service.StudentService;

import java.util.List;

/**
 * projectName: com.wang.controller
 *
 * @Date: 2024/10/15 23:18
 * descriptions 表述层
 * @Author: 王玉豪
 */
public class StudentController {

    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * 查询全部学生数据
     */
    public void findAll() {
        List<Student> studentList = studentService.findAll();
        System.out.println("studentList :" + studentList);
    }

}
