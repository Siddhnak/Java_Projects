package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("car")  //Automatically detect while scanning the component
//@Primary
public class Car implements Vehicle {
    @Override
    public void move(){
        System.out.println("yoo..wohoo 🚗 \nthe car is moving");
    }
}
