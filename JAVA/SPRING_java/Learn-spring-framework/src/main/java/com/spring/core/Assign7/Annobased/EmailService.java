package com.spring.core.Assign7.Annobased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//This class is RESPONSIBLE TO SEND THE EMAILS..
//only  ====== We have to use Constructor injection to inject the dependencies

@Component //this will make a spring bean for this class and manage that spring
public class EmailService {
//    private DataSource dataSource;  //Dependency of DS
    private DataSource mysqlDataSource;  //to use @Qualifier
    private DataSource postgreSqlDataSource;  //to use @Qualifier


    // IDK THIS.. IN CASE OF CONSTRUCTOR INJECTION...  WE DON'T NEED @Autowire..4.3 onwards
//    @Autowired
//    public EmailService(@Qualifier())(DataSource dataSource) {  //Since we are asked to follow Constructor based injection
//        this.dataSource = dataSource;
//    }

    //below part to use @Qualifier
    @Autowired
    public EmailService(
            @Qualifier("mysqlDS") DataSource mysqlDataSource,
            @Qualifier("postgreSqlDs") DataSource postgreSqlDataSource
    ) {
        this.mysqlDataSource = mysqlDataSource;
        this.postgreSqlDataSource = postgreSqlDataSource;
    }

    public void sendEmail() {
        String[] mysqlEmails = mysqlDataSource.getEmails();
//        String[] postgreSqlEmails = postgreSqlDataSource.getEmails();

        System.out.println("MySQL Emails:");
        for (String email : mysqlEmails) {
            System.out.println(email);
        }

//        System.out.println("PostgreSQL Emails:");
//        for (String email : postgreSqlEmails) {
//            System.out.println(email);
//        }
    }

//    public void sendEmail(){ // to send the emails..
//    String[] emails =dataSource.getEmails();
//
//    for(String email: emails){
//        System.out.println(email);
//    }
//    }





    //Implementing the Datasource created
//    @Override
//    public String[] getEmails() {  //overriding the
//        String[] emails={"hulk@gmail.com" ,"byebye@gmail.com"
//                , "tata123@gmail.com"};
//    System.out.println(emails);
//    return emails;
    }
//}

