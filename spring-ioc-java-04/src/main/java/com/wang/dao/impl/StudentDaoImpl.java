package com.wang.dao.impl;

import com.wang.dao.StudentDao;
import com.wang.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * projectName: com.wang.dao.impl
 *
 * @Author: 王玉豪
 * @Date: 2024/10/16 21:52
 * @descriptions:
 */

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> findAll() {
        String sql = "select id, name, gender, age, class classes from studb.students";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }
}
