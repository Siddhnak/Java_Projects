package com.spring.core.Assign7.Annobased;

import org.springframework.stereotype.Component;

//This class is RESPONSIBLE TO SEND THE EMAILS..
//only  ====== We have to use Constructor injection to inject the dependencies

@Component //this will make a spring bean for this class and manage that spring
public  class EmailService {
    private DataSource dataSource;  //Dependency of DS
// IDK THIS.. IN CASE OF CONSTRUCTOR INJECTION...  WE DON'T NEED @Autowire..4.3 onwards
    public EmailService(DataSource dataSource) {  //Since we are asked to follow Constructor based injection
        this.dataSource = dataSource;
    }

    void sendEmail(){ // to send the emails..
    String[] emails =dataSource.getEmails();

    for(String email: emails){
        System.out.println(email);
    }
    }
    //Implementing the Datasource created
//    @Override
//    public String[] getEmails() {  //overriding the
//        String[] emails={"hulk@gmail.com" ,"byebye@gmail.com"
//                , "tata123@gmail.com"};
//    System.out.println(emails);
//    return emails;
    }
//}

