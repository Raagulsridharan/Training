package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        //Step-1 : Create the spring container
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myConfig.xml");

        //Step-2 : retrieve the spring bean
        Student student = applicationContext.getBean("std",Student.class);

        //Step-3 : call the business methods
        student.printDetails();
    }
}
