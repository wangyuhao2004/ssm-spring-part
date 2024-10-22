package com.wang.dao;

import com.wang.pojo.Student;

import java.util.List;

/**
 * projectName: com.wang.dao
 *
 * @Date: 2024/10/16 17:58
 * descriptions
 * @Author: 王玉豪
 */
public interface  StudentDao {

    /**
     * 在数据库当中查找全部学生数据,封装成student对象并返回
     * @return list集合
     */
    List<Student> findAll();
}
