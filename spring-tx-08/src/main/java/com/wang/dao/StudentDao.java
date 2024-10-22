package com.wang.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * projectName: com.wang.dao
 *
 * @Author: 王玉豪
 * @Date: 2024/10/20 15:26
 * @descriptions:
 */

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * 根据id修改年龄
     * @param age
     * @param id
     */
    public void updateAgeById(int age, int id) {
        String sql = "update studb.students set age = ? where id = ?;";
        jdbcTemplate.update(sql, age, id);
    }


    public void updateNameById(String name, int id) {
        String sql = "update studb.students set name = ? where id = ?;";
        jdbcTemplate.update(sql,name,id);
    }
}
