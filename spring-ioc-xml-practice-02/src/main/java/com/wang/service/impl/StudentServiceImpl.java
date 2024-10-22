package com.wang.service.impl;

import com.wang.dao.StudentDao;
import com.wang.pojo.Student;
import com.wang.service.StudentService;

import java.util.List;

/**
 * projectName: com.wang.service.impl
 * @Date: 2024/10/15 23:15
 * descriptions 业务层接口实现类
 * @Author: 王玉豪
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
