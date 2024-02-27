package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Client {
    public static void main(String[] args) {

        /*We need to create the inst of car class ref var and
         pass it traveller class obje*/
        //using interface as ref variable is ok too..
//        Vehicle vehicle=new Car();//just change here
//
//        Traveller traveller=new Traveller(vehicle); //passed in
//         traveller.startJourney();


// Creating Spring IoC container
//Read the conf class
//Create and Manage the Spring beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

//Retrieve Spring bean from the Spring IoC container
//        Car car=applicationContext.getBean(Car.class);
//        car.move();
//
//        Bike bike = applicationContext.getBean(Bike.class);
//        bike.move();
//
//        Cycle cycle=applicationContext.getBean(Cycle.class);
//        cycle.move();
//      ONly keeping the traveller bean to create the spring bean
        Traveller traveller= applicationContext.getBean(Traveller.class);
        traveller.startJourney();
        }
    }
