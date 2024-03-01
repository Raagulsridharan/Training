package com.revature.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vodafone")
public class Vodafone implements SIM {
    DataServices dataServices;
    @Autowired
    public Vodafone(DataServices dataServices){
        this.dataServices = dataServices;
    }

    @Override
    public String voiceCall() {
        return "Get free calls....";
    }

    @Override
    public String getData() {
        return dataServices.getDataService();
    }
}
