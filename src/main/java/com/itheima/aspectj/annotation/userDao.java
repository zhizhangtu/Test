package com.itheima.aspectj.annotation;


import org.springframework.stereotype.Component;


@Component("userDao")
public class userDao  {

    public void addUser() {
        System.out.println("添加用户");
    }


    public void deleteUser() {
        System.out.println("删除用户");
    }
}
