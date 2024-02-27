package com.spring.core.di;

import org.springframework.stereotype.Component;

@Component   //this will make a spring bean for this class and manage that spring bean lifecycle
public class EmailService implements MessageService  {
   @Override
    public void sendMessage(String message) {
        System.out.println("Email "+message);
    }
}
//logic
/*Class--Method-- Sout'(message calledd in client)*/


/* 19

This class implements MessageService interface
and let's annotate this method with @Override annotation
Same to be done in the EmailService..
6:48 / 8:52*/
