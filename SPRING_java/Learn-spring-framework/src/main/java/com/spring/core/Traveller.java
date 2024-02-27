package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveller")
public class Traveller {
//           USING CAR class's instance to move it =TIGHTLY COUPLED=
//    Car car= null;   /*Creating a car instance*/
//
//    public Traveller(){
//        this.car=new Car(); /*Creating an instance within a constructor*/
//    }
//    public void startJourney(){
//        this.car.move();
//    }

//    Bike bike =null;

//              ACHIEVING   ==lOOSE COUPLING==

    private Vehicle vehicle; /*Creating an interface reference */

    @Autowired // TO AVOID the ambiguity or get read for no Qual bean
//    public Traveller(@Qualifier("cycle") Vehicle vehicle){ //Commented for @Primary
    public Traveller(Vehicle vehicle){
    this.vehicle=vehicle;

    }

    public void startJourney(){
        this.vehicle.move();
    }
}
