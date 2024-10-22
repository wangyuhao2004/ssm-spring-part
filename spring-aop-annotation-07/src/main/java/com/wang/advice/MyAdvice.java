package com.wang.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * projectName: com.wang.advice
 *
 * @Author: 王玉豪
 * @Date: 2024/10/19 14:03
 * @descriptions: 定义四个增强方法, 获取目标方法的信息
 */

@Component
@Aspect
@Order(20) //指定一个增强的优先级,值越小,优先级越高! 优先级越高的前置先执行,后置后执行
public class MyAdvice {

    @Before("com.wang.pointcut.MyPointCut.pc()")
    public void before(JoinPoint joinPoint) {
        //获取目标方法所属的类的信息
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        //获取目标方法的修饰符
        int modifiers = joinPoint.getSignature().getModifiers();
        String s = Modifier.toString(modifiers);
        //获取目标方法的名称
        String methodName = joinPoint.getSignature().getName();
        //获取目标方法的参数名
        Object[] args = joinPoint.getArgs();

        System.out.println("方法所属类:" + simpleName);
        System.out.println("方法的修饰名:" + s);
        System.out.println("方法的名称:" + methodName);
        System.out.println("方法的参数:" + Arrays.toString(args));
    }

    @AfterReturning(value = "com.wang.pointcut.MyPointCut.pc()", returning = "result")
    public void afterReturning(Object result) {
        System.out.println("方法的返回值:" + result);
    }

    @AfterThrowing(value = "com.wang.pointcut.MyPointCut.pc()",throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("方法的异常信息:" + e);
    }
    @After("com.wang.pointcut.MyPointCut.pc()")
    public void after() {

    }


}
