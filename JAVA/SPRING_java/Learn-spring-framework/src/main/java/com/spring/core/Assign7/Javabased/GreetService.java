package com.spring.core.Assign7.Javabased;
//This class will be responsible for sending out the emails..
public class GreetService {
    private Datsou datsou;  //Creating an instance of Datsou

    public GreetService(Datsou datsou)
    {
        this.datsou=datsou;
    }
    //Simple method to send the emails..
    void sendGreetings(){
        String[] greet = datsou.getGreet();

        for(String gre:greet){
            System.out.println(gre);
        }
    }
}
