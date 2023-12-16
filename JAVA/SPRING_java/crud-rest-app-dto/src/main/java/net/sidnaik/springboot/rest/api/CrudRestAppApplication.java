package net.sidnaik.springboot.rest.api;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudRestAppApplication {

	//Step 2 L78
	@Bean // will @Bean annotation will configure this ModelMapper class as a spring bean and it will register in our appcontext

	public ModelMapper modelMapper(){  // L78  2:53  CREATED a method instead of using new keyword
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudRestAppApplication.class, args);
	}

}
