package com.wang.service;

import com.wang.pojo.Student;

import java.util.List;

/**
 * projectName: com.wang.service
 *
 * @Date: 2024/10/15 23:14
 * descriptions 业务层
 * @Author: 王玉豪
 */
public interface StudentService {
    /**
     * 查询全部学生数据的接口
     * @return 返回一个list集合 , 类型为student
     */
    List<Student> findAll();
}
