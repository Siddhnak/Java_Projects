package com.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {

        String message = "Hello there sir.. \nThis is using the Dependency Injection";
//        SMSService smsService = new SMSService();
//        EmailService emailService =new EmailService();
        /*Spring framework to create an instance of this class and manage that instance.*/
//        MessageSender messageSender = new MessageSender(emailService);
//        messageSender.sendMessage(message);

        ApplicationContext applicationContext =
    new AnnotationConfigApplicationContext
            (AppConfig.class);

        /*let us retrieve MessageSender spring bean from the ApplicationContext.*/
        MessageSender messageSender =
    applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage(message);
    }
}
