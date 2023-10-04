package com.spring.core;

import org.springframework.stereotype.Component;

@Component("cycle")
public class Cycle implements Vehicle {
    public void move(){
        System.out.println("Raang Raang🚴‍♂️ \nThe cycle is moving");

    }

}
