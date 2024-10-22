package com.wang.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * projectName: com.wang.advice
 *
 * @Author: 王玉豪
 * @Date: 2024/10/19 13:35
 * @descriptions: 增强类,里面写增强代码
 *
 *      一.使用注解配置增强代码,指定对应的位置
 *          1.前置  @Before
 *          2.后置  @AfterReturning
 *          3.异常  @AfterThrowing
 *          4.最后  @After
 *          5.环绕  @Around
 *
 *      二.编写切点表达式,选中方法
 *
 *      三.开启@Aspect注解
 */

//@Component
//@Aspect
public class LogAdvice {

    @Before("com.wang.pointcut.MyPointCut.pc()")
    public void start() {
        System.out.println("方法开始了");
    }

    @After("com.wang.pointcut.MyPointCut.pc()")
    public void after() {
        System.out.println("方法结束了");
    }

    @AfterThrowing("com.wang.pointcut.MyPointCut.pc()")
    public void error() {
        System.out.println("方法报错了");
    }
}
