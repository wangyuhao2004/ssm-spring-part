package com.wang.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * projectName: com.wang.advice
 *
 * @Author: 王玉豪
 * @Date: 2024/10/19 15:24
 * @descriptions: 环绕增强
 */

@Component
@Aspect
@Order(10) //指定一个增强的优先级,值越小,优先级越高! 优先级越高的前置先执行,后置后执行
public class TxAroundAdvice {

    @Around("com.wang.pointcut.MyPointCut.pc()")
    public Object transaction(ProceedingJoinPoint proceedingJoinPoint) {
        //获取目标方法参数
        Object[] args = proceedingJoinPoint.getArgs();
        Object result = null;

        try {
            System.out.println("事务开启了");
            //目标方法执行,并返回结果
            result = proceedingJoinPoint.proceed(args);
            System.out.println("事务提交了");
        } catch (Throwable e) {
            System.out.println("事务回滚了");
            throw new RuntimeException(e);
        }
        return result;
    }
}
