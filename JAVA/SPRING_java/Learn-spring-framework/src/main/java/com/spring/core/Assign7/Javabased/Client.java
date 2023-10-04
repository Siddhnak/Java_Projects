package com.spring.core.Assign7.Javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
        GreetService greetService =applicationContext.getBean(GreetService.class);
        greetService.sendGreetings();
    }
}
