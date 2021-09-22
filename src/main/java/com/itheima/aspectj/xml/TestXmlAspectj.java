package com.itheima.aspectj.xml;

import com.itheima.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlAspectj {
    public static void main(String[] args) {
        String xmlPath="applicationContext2.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        userDao.addUser();
    }
}
