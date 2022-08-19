package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;

/**
 * @author kasio
 * @create 2021-10-27 17:11
 */
public class UserService {

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add......");
        userDao.update();
    }
}
