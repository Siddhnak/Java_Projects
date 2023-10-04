package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component   /*Its the part of the annotation based config
also the Autowire and the*/
public class MessageSender {

    @Autowired
    @Qualifier("emailService")
    private MessageService messageService;

    private MessageService smsService;

////    @Autowired  /*Commenting this out to check if it really works..*/
//    public MessageSender(@Qualifier("emailService")MessageService messageService) {
//        this.messageService = messageService;
//    }
//@Autowired  //THis one is SETTER for email service as we have specified..
//    public void setMessageService(@Qualifier("emailService") MessageService messageService) {
//        this.messageService = messageService;
//    System.out.println("Setter based DI");
//    }


    public void sendMessage(String message) {
        this.messageService.sendMessage(message);}

}
