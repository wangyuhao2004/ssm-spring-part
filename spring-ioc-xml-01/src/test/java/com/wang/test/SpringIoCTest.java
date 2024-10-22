package com.wang.test;

import com.wang.ioc_03.HappyComponent;
import com.wang.ioc_05.JavaBean;
import com.wang.ioc_05.JavaBeanFactoryBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
   * projectName: com.wang.test 
   * @Date: 2024/10/13 22:01
   * descriptions ioc容器创建和读取组件的测试类
   * @Author: 王玉豪
*/
    public class SpringIoCTest {

    /**
     * 创建IoC容器并读取配置文件
     */
    @Test
    public void createIoC() {
        /*
        * 接口
        *   BeanFactory
        *
        *   ApplicationContext
        *
        * 实现类
        *   ClassPathXmlApplicationContext  读取类路径下的xml配置方式 classes
        *   FileSystemXmlApplicationContext 读取指定文件位置的xml配置方式
        *   AnnotationConfigApplicationContext 读取配置类方式的ioc容器
        *   WebApplicationContext  web项目专属的ioc容器
        * */

        //直接创建容器并指定配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_03.xml");


    }

    @Test
    //在IoC容器中获取组件bean
    public void getBeanFromIoC() {
        //1.创建IoC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_03.xml");

        //2.读取IoC容器的组件
        //方式一:根据beanId获取即可,返回值为object类型,需要强转
        HappyComponent happyComponent = (HappyComponent) applicationContext.getBean("happyComponent");
        happyComponent.doWork();
        //方式二;根据beanId获取,指定返回值类型
        HappyComponent happyComponent1 = applicationContext.getBean("happyComponent", HappyComponent.class);
        happyComponent1.doWork();
        //方式三:直接根据类型获取
        //TODO:根据bean的类型获取,同一个类型,在ioc容器当中只能有一个bean
        HappyComponent happyComponent2 = applicationContext.getBean(HappyComponent.class);
        happyComponent2.doWork();

        //获取的为同一个对象
        System.out.println(happyComponent == happyComponent1);
        System.out.println(happyComponent1 == happyComponent2);
        System.out.println(happyComponent2 == happyComponent);

    }


    /**
     * 测试ioc配置的初始化
     */
    @Test
    public void test_04() {
        //根据xml配置文件创建ioc容器的时候,会回调初始化方法
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring_04.xml");

        //正常释放ioc容器的时候会回调销毁方法
        applicationContext.close();
    }

    /**
     * 测试读取FactoryBean工厂配置的组件对象
     */
    @Test
    public void test_05() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring_05.xml");

        JavaBean bean = applicationContext.getBean("javaBean", JavaBean.class);
        //todo:factoryBean工厂也会加入到ioc容器  名字为:&id
        Object bean1 = applicationContext.getBean("&javaBean");
        System.out.println(bean.getName());
        System.out.println(bean.getAge());
        System.out.println("bean: " + bean);
        System.out.println("bean1: " + bean1);
    }
}
