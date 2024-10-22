package com.wang.dao;

import com.wang.pojo.Student;

import java.util.List;

/**
 * projectName: com.wang.dao
 *
 * @Date: 2024/10/15 23:16
 * descriptions 持久层
 * @Author: 王玉豪
 */
public interface StudentDao {
    /**
     * 在数据库当中查询全部学生对象的接口
     * @return 返回list集合
     */
    List<Student> findAll();
}
