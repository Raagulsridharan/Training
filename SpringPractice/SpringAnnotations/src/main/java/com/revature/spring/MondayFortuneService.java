package com.revature.spring;

import org.springframework.stereotype.Component;

@Component
public class MondayFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Hey its monday.....";
    }
}
