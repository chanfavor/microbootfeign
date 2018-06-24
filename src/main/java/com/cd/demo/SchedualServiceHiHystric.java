package com.cd.demo;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHi(String name) {
        return "hi, " + name + ", sorry Error~";
    }
}
