package com.wang.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * projectName: com.wang.pointcut
 *
 * @Author: 王玉豪
 * @Date: 2024/10/19 15:05
 * @descriptions: 存储切点表达式的类
 */

@Component
public class MyPointCut {

    @Pointcut("execution(* com.wang.service.impl.*.* (..))")
    public void pc() {}
}
