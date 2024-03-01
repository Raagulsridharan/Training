package com.revature.spring;

import org.springframework.stereotype.Component;

@Component("dataServices")
public class DataServices implements SIMServices{
    @Override
    public String getDataService() {
        return "Get free 5GB data....";
    }
}
