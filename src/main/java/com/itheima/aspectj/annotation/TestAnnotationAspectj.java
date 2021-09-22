package com.itheima.aspectj.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationAspectj {

        public static void main(String[] args) {
            String xmlPath="applicationContext3.xml";
            ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
            userDao userDao= (userDao) applicationContext.getBean("userDao");
            userDao.addUser();
        }


}
