package com.spring.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student{
    private Address address;

    public Student(Address address){
        this.address=address;  //THis is simply done bcos it's like copying.. address
    }
    public void print(){
        System.out.println("Student class method is called here..");
    }
    public void init(){
        System.out.println("Initialization logic...");
    }
    public void destroy(){
        System.out.println("Destruction logic...in 1...2..3");
    }
}

class Address{

    public void print(){
        System.out.println("Address class method is called...");
    }
}

@Configuration
class AppConfig{

    @Bean(name ="addressBean")
    public Address address(){
        return new Address();
    }
    @Bean(name="studentBean",initMethod = "init",destroyMethod = "destroy")
    public Student student(){
        return new Student(address());
    }

}

public class BeanAnnotationDemo {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); //before try catch
        try(var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)){
            //        Student student= applicationContext.getBean(Student.class);  //for the default bean inexplicit
            Student student= (Student) applicationContext.getBean("studentBean");

            String[] beanNames = applicationContext.getBeanDefinitionNames();
            for (String bean: beanNames){
                System.out.println(bean);
            }

            student.print();
        }

    }
}
