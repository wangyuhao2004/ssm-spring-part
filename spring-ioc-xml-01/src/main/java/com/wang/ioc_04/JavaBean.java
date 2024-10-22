package com.wang.ioc_04;

/**
 * projectName: com.wang.ioc_04
 *
 * @Date: 2024/10/14 19:38
 * descriptions
 * @Author: 王玉豪
 */
public class JavaBean {

    /**
     * 初始化方法
     */
    public void init() {
        System.out.println("JavaBean.init");
    }

    /**
     * 销毁方法
     */
    public void clear() {
        System.out.println("JavaBean.clear");
    }
}
