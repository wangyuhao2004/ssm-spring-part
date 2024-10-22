package com.wang.service.impl;

import com.wang.dao.StudentDao;
import com.wang.pojo.Student;
import com.wang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: com.wang.service.impl
 *
 * @Author: 王玉豪
 * @Date: 2024/10/16 21:52
 * @descriptions:
 */

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    @Qualifier("studentDao")
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
