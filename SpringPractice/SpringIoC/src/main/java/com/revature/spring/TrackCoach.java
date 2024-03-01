package com.revature.spring;

public class TrackCoach implements Coach{
    HappyFortuneService happyFortuneService;
    public TrackCoach(HappyFortuneService happyFortuneService){
        this.happyFortuneService = happyFortuneService;
    }
    public String getDailyPractice() {
        return "Run 5km....";
    }

    @Override
    public String getDailyFOrtune() {
//        HappyFortuneService happyFortuneService = new HappyFortuneService();
        return happyFortuneService.getFortune();
    }

    public void setUp(){
        System.out.println("Initializing the method.....");
    }
    public void cleanUp(){
        System.out.println("CleanUp the method.....");
    }
}
