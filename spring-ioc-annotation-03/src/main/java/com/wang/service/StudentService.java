package com.wang.service;

import com.wang.pojo.Student;

import java.util.List;

/**
 * projectName: com.wang.service
 *
 * @Date: 2024/10/16 17:58
 * descriptions
 * @Author: 王玉豪
 */
public interface StudentService {

    /**
     * 在数据库当中查询全部学生对象
     * @return list集合
     */
    List<Student> findAll();
}
