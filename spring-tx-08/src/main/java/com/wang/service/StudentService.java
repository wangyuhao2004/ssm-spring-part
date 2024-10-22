package com.wang.service;

import com.wang.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Transactional;

/**
 * projectName: com.wang.service
 *
 * @Author: 王玉豪
 * @Date: 2024/10/20 15:27
 * @descriptions:
 */

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private TransactionManager transactionManager;

    /*
        添加事务
            @Transactional
            位置:类上 | 方法上
            方法:该方法有事务
            类:该类下的所有方法都有事务

        1.只读模式
            只读模式可以提高数据查询的效率,推荐事务中只有查询代码,使用只读模式
            默认 boolean readOnly() default false
            解释:一般情况下,都是通过类添加注解添加事务
            类下的所有方法都有事务
            类中的查询方法可以通过再次添加注解,设置为只读模式,提高查询效率

        2.超时时间
            默认 timeout = -1  永远不会超时
            可以设置超时时间 时间 秒
            当事务运行超过这个时间还没有提交,自动回滚事务,并抛出TransactionTimedOutException异常
    * */
    @Transactional(timeout = 3)
    public void changeInfo() {
        studentDao.updateAgeById(100, 1);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------");
        studentDao.updateNameById("test",1);
    }

}
