package com.revature;

public class MainClass {
    public static void main(String[] args) {
        Coach baseBallCoach = new BaseBallCoach();
        System.out.println(baseBallCoach.getDailyPractice());

        Coach trackCoach = new TrackCoach();
        System.out.println(trackCoach.getDailyPractice());
    }
}
