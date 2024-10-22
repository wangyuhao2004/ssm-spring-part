package com.wang.service.impl;

import com.wang.dao.StudentDao;
import com.wang.pojo.Student;
import com.wang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * projectName: com.wang.service.impl
 *
 * @Date: 2024/10/16 17:59
 * descriptions
 * @Author: 王玉豪
 */

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    @Qualifier("studentDao")
    private StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return this.studentDao.findAll();
    }
}
