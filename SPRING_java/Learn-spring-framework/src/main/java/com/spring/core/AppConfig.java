package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //now this has become a java based annotation class
@ComponentScan(basePackages = "com.spring.core")
public class AppConfig {

//    /*Creating spring beans is
//    * very simple.. -- just create a method*/
//
//    @Bean   /*@Bean tells that this method returns an instance of the car classSpring IoC has to manage that instance*/
//    public Vehicle car(){
//        return new Car();
//    }
//
//    @Bean
//    public Vehicle bike(){
//        return new Bike();
//    }
//    @Bean
//    public Vehicle Cycle(){
//        return new Cycle();
//    }
//
//    @Bean
//    public Traveller traveller(){
//        return new Traveller(car());
//    }
}
