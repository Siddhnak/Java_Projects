package com.spboot.DohaRiff;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DohaRiffApplication {

	//L121  ==2nd Step==
	//Using the Model Mapper to simplify the dto to entity and Vversa
	//Configuring the spring bean here now..

	@Bean // To tell spring to manage the below object
public ModelMapper modelMapper(){    //Model mapper object
	return new ModelMapper();
}

	public static void main(String[] args) {
		SpringApplication.run(DohaRiffApplication.class, args);
	}

}
//Step 3 Injecting the Model Mapper class object in DohaServiceImpl class