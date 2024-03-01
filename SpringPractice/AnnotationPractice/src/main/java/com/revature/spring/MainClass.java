package com.revature.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        SIM sim = applicationContext.getBean("vodafone", Vodafone.class);

        System.out.println(sim.voiceCall());
        System.out.println(sim.getData());

        applicationContext.close();
    }
}
