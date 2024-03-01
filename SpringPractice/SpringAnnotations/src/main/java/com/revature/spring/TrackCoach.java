package com.revature.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("trackCoach")
public class TrackCoach implements Coach{
//    @Autowired
    MondayFortuneService mondayFortuneService;
    @Autowired
    public TrackCoach(MondayFortuneService mondayFortuneService){
        this.mondayFortuneService = mondayFortuneService;
    }

//    @Autowired
//    public void setMondayFortuneService(MondayFortuneService mondayFortuneService) {
//        this.mondayFortuneService = mondayFortuneService;
//    }

    @Override
    public String getDailyPractice() {
        return "Run 5km.....";
    }

    @Override
    public String getDailyFortune() {
        //create  obj for MondayFortuneService
        //MondayFortuneService mondayFortuneService = new MondayFortuneService();
        return mondayFortuneService.getFortune();
    }
}
