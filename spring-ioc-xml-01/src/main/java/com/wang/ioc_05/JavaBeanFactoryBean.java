package com.wang.ioc_05;

import org.springframework.beans.factory.FactoryBean;

/**
 * projectName: com.wang.ioc_05
 *
 * @Date: 2024/10/15 12:11
 * descriptions 制造JavaBean的工厂Bean对象
 * @Author: 王玉豪
 */
//TODO:实现FactoryBean接口,泛型为返回值类型
public class JavaBeanFactoryBean implements FactoryBean<JavaBean> {

    private String name;
    private Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //创建对象的业务
    @Override
    public JavaBean getObject() throws Exception {
        JavaBean javaBean = new JavaBean();
        javaBean.setName(name);
        javaBean.setAge(age);
        return javaBean;
    }

    //返回对象的类型
    @Override
    public Class<?> getObjectType() {
        return JavaBean.class;
    }
}
