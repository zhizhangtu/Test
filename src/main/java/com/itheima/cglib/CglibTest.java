package com.itheima.cglib;

import com.itheima.jdk.UserDao;
import com.itheima.jdk.UserDaoImpl;

public class CglibTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy=new CglibProxy();
        UserDao userDao =new UserDaoImpl();
        UserDao userDao1= (UserDao) cglibProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
