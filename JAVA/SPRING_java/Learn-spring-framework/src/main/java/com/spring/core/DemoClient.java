package com.spring.core;

import com.spring.core.controller.DemoController;
import com.spring.core.repository.DemoRepository;
import com.spring.core.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {
    public static void main(String[] args) {
        //Within a main method, let's create an application context object.

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieving the beans
        DemoController demoController = applicationContext.getBean(DemoController.class);
        System.out.println(demoController.hello());

        DemoService demoService = applicationContext.getBean(DemoService.class);
        System.out.println(demoService.hello());

        DemoRepository demoRepository =applicationContext.getBean(DemoRepository.class);
        System.out.println(demoRepository.hello());

    }
}
//6467145365
//+385915981787
//+4591457271