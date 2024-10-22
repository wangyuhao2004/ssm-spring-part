package com.wang;

import com.alibaba.druid.pool.DruidDataSource;
import com.wang.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * projectName: com.wang
 *
 * @Date: 2024/10/15 18:44
 * descriptions 测试JdbcTemplate的使用
 * @Author: 王玉豪
 */
public class JdbcTemplateTest {

    /**
     * 采用java代码进行数据库操作的方法
     */
    @Test
    public void TestForJava() {

        //创建数据库连接池,进行配置
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql:///studb");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        //实例化对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        //调用方法
        //jdbcTemplate.update(); 增删改操作
        //jdbcTemplate.queryForObject() 查询操作,返回单个数据
        //jdbcTemplate.query() 返回集合

        String sql = "insert into studb.students values (default,?,?,?,?)";
        int i = jdbcTemplate.update(sql, "二狗子", "男", 18, "三年二班");
        System.out.println(i);
    }

    /**
     * 通过ioc容器创建数据库管理对象
     */
    @Test
    public void TestForIoC() {

        //创建ioc容器
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-01.xml");

        //获取jdbcTemplate组件
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);

     //进行数据库的curd操作
        String sql1 = "insert into studb.students values (default,?,?,?,?)";
        int row = jdbcTemplate.update(sql1, "二狗子", "男", 18, "三年二班");
        System.out.println("row:" + row);

        //查询单个对象
        //根据id查询学生数据,返回一个对应的实体对象
        String sql2 = "select id, name, gender, age, class  from studb.students where id = ?";

        /*
            参数一:sql语句
            参数二:RowMapper  列名和属性名的映射器接口
            参数三:可变参数
        * */
        Student student = jdbcTemplate.queryForObject(sql2, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setGender(rs.getString("gender"));
                student.setAge(rs.getInt("age"));
                student.setClasses(rs.getString("class"));
                return student;
            }
        }, 1);

        System.out.println(student.toString());

        //查询全部学生数据
        String sql3 = "select id, name, gender, age, class classes from studb.students";

        //todo:BeanPropertyRowMapper帮我们自动映射列和属性值,要求列名和属性名一致, 不一致的在查询时起别名
        List<Student> studentList = jdbcTemplate.query(sql3, new BeanPropertyRowMapper<>(Student.class));

        System.out.println(studentList);

    }

}
