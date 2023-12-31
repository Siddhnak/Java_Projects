package net.sidnaik.springboot.rest.api.service;

import net.sidnaik.springboot.rest.api.entity.User;

import java.util.List;


public interface UserService {
User createUser(User user);   //can't have a BODY..

    /*Let's remove the null as we want to get something now
        Well, we can get a User object from this Optional User by using get method.
        get() method returns a User*/
User getUserById(Long userId);

//User getUserById(Long userId); /* CSR reason meth here| let's go and let's implement this
//                                    getUserById method in a UserServiceImpl class.*/
 // L65 GetAllUsers rest API

    /* Lets define the method in the userService interface*/
List<User> getAlluser(); //always start with Service layer first as Controller is going to depend on this (Service layer)


    //L66 Update user RestApi
User updateUser(User user);

void deleteUser(Long userId);
}
