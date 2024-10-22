package com.wang.statics;

import com.wang.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * projectName: com.wang.statics
 *
 * @Author: 王玉豪
 * @Date: 2024/10/17 18:42
 * @descriptions: 静态代理类
 */

@Component
public class StaticProxyCalculator implements Calculator {

    @Autowired
    @Qualifier("calculator")
    private Calculator calculator;

    @Override
    public int add(int i, int j) {
        System.out.println("加法运算:");
        int result = calculator.add(i, j);
        System.out.println("result:" + result);
        return result;
    }

    @Override
    public int subtract(int i, int j) {

        System.out.println("减法运算:");
        int result = calculator.subtract(i, j);
        System.out.println("result:" + result);
        return result;
    }

    @Override
    public int multiplication(int i, int j) {
        System.out.println("乘法法运算:");
        int result = calculator.multiplication(i, j);
        System.out.println("result:" + result);
        return result;
    }

    @Override
    public double division(double i, double j) {

        System.out.println("除法法运算:");
        double result = calculator.division(i, j);
        System.out.println("result:" + result);
        return result;
    }
}
