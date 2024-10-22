package com.wang.dao.impl;

import com.wang.dao.StudentDao;
import com.wang.pojo.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static java.util.List.*;

/**
 * projectName: com.wang.dao.impl
 *
 * @Date: 2024/10/15 23:17
 * descriptions 持久层接口实现类
 * @Author: 王玉豪
 */
public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Student> findAll() {

        String sql = "select id, name, gender, age, class classes from studb.students";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }
}
