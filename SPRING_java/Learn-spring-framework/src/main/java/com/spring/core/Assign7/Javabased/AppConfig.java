package com.spring.core.Assign7.Javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //WE have to manually create objects
@Bean
    public Datsou mysqlds (){//Return type always have to be the interface
            return new Msqlds();
        }
        @Bean
    public  Datsou postds(){
    return new Postds();
    }

    @Bean
    public  GreetService greetService(){
        return new GreetService(postds());
    }

    }

