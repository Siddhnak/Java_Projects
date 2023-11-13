package com.spring.core.di;


import org.springframework.stereotype.Component;

//logic
/*Class--Method-- Sout'(message called in client class)*/
@Component("smsService")
public class SMSService implements MessageService {

    @Override
    public void sendMessage(String message){
        System.out.println("SMS "+message);
    }
/*6:08 / 8:52
Okay, so let's abstract this sendMessage method in a MessageService interface.
19. Example - Without Dependency Injection
*/
}
