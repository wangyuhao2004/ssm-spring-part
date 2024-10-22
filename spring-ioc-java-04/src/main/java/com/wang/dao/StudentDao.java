package com.wang.dao;

import com.wang.pojo.Student;

import java.util.List;

/**
 * projectName: com.wang.dao
 *
 * @Author: 王玉豪
 * @Date: 2024/10/16 21:51
 * @descriptions:
 */

public interface StudentDao {

    /**
     * 查询全部学生对象
     * @return list集合
     */
    List<Student> findAll();
}
