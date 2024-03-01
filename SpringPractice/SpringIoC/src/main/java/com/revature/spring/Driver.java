package com.revature.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        //Step-1 : Create the spring container
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("myConfig.xml");

        //Step-2 : retrieve the spring bean
        Coach coach = (Coach)classPathXmlApplicationContext.getBean("trackCoach");
        //or
        //Coach coach1 = classPathXmlApplicationContext.getBean("trackCoach",TrackCoach.class);

        //Step-3 : call the business methods
        System.out.println(coach.getDailyPractice());
        System.out.println(coach.getDailyFOrtune());

        //Step-4 : close the context
        classPathXmlApplicationContext.close();
    }
}
