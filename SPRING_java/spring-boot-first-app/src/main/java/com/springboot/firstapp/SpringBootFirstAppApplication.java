package com.springboot.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstAppApplication {

	public static void main(String[] args) {
		// run method returns app config object
		ApplicationContext applicationContext= SpringApplication.run(SpringBootFirstAppApplication.class, args);
		//Next, let us get all the string bean names from the application context object.
		String[] beanNames= applicationContext.getBeanDefinitionNames() ; //Lets get all of this as a Spring array..
		//A for each loop
		for (String bean: beanNames){
			System.out.println(bean);
		}
	}

}
