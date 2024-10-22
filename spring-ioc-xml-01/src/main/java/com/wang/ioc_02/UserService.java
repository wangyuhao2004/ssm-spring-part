package com.wang.ioc_02;

/**
 * @Author 王玉豪
 * @Date 2024/10/13 14:20
 * @PackageName:com.wang.ioc_02
 */
public class UserService {
    private UserDao userDao;

    public UserService (UserDao userDao) {
        this.userDao = userDao;
    }

    private String name;
    private Integer age;

    public UserService (String name , Integer age, UserDao userDao) {
        this.name = name;
        this.age = age;
        this.userDao = userDao;
    }
}
