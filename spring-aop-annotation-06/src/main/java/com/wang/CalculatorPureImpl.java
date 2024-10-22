package com.wang;

import org.springframework.stereotype.Component;

/**
 * projectName: com.wang
 *
 * @Author: 王玉豪
 * @Date: 2024/10/17 18:32
 * @descriptions:
 */

@Component(value = "calculator")
public class CalculatorPureImpl implements Calculator {

    /**
     * 加法运算
     * @param i
     * @param j
     * @return
     */
    public int add(int i, int j) {
        return i + j;
    }

    /**
     * 减法运算
     * @param i
     * @param j
     * @return
     */
    public int subtract(int i, int j) {
        return i - j;
    }

    /**
     * 乘法运算
     * @param i
     * @param j
     * @return
     */
    public int multiplication(int i, int j){
        return i * j;
    }

    /**
     * 除法运算
     * @param i
     * @param j
     * @return
     */
    public double division(double i, double j) {
        if (j != 0) {
            return i / j;
        }
        return -1;
    }
}
