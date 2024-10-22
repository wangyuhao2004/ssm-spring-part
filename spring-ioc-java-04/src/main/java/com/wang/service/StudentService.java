package com.wang.service;

import com.wang.pojo.Student;

import java.util.List;

/**
 * projectName: com.wang.service
 *
 * @Author: 王玉豪
 * @Date: 2024/10/16 21:52
 * @descriptions:
 */

public interface StudentService {

    /**
     * 在数据库当中查找全部学生数据
     * @return list集合
     */
    List<Student> findAll();
}
