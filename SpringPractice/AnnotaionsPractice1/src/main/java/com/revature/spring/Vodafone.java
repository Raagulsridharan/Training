package com.revature.spring;

import org.springframework.stereotype.Component;

@Component("vi")
public class Vodafone implements SIM{
    public String voiceCall() {
        return null;
    }
}
