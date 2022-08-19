package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.User;
import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kasio
 * @create 2021-10-27 18:15
 */
public class TestBean {
    @Test
    public void testBean1(){
        //1.加载spring配置文件
        //配置文件在src的根目录里
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        //2.获取配置文件创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testBean2(){
        //1.加载spring配置文件
        //配置文件在src的根目录里
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");

        //2.获取配置文件创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }

    @Test
    public void testBean3(){
        //1.加载spring配置文件
        //配置文件在src的根目录里
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");

        //2.获取配置文件创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }
}
