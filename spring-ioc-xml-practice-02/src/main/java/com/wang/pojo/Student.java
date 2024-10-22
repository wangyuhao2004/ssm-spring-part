package com.wang.pojo;

/**
 * projectName: com.wang.pojo
 *
 * @Date: 2024/10/15 18:38
 * descriptions 数据库表对应的实体类
 * @Author: 王玉豪
 */
public class Student {

    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String classes;


    public Student() {
    }

    public Student(Integer id, String name, String gender, Integer age, String classes) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.classes = classes;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return classes
     */
    public String getClasses() {
        return classes;
    }

    /**
     * 设置
     * @param classes
     */
    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", gender = " + gender + ", age = " + age + ", classes = " + classes + "}";
    }
}
