package com.revature.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        //Step-1 : load the container
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        //Step-2 : retrieve the bean
        Coach coach = applicationContext.getBean("trackCoach", TrackCoach.class);
        //Step-3 : call the business method
        System.out.println(coach.getDailyPractice());
        System.out.println(coach.getDailyFortune());
        //step-4 : close the context
        applicationContext.close();
    }
}
