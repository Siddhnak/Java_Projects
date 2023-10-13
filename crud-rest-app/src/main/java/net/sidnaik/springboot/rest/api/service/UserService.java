package net.sidnaik.springboot.rest.api.service;

import net.sidnaik.springboot.rest.api.entity.User;



public interface UserService {
User createUser(User user);

    /*Let's remove the null as we want to get something now
        Well, we can get a User object from this Optional User by using get method.
        get() method returns a User*/
    User getUserById(Long userId);

//User getUserById(Long userId); /* CSR reason meth here| let's go and let's implement this
//                                    getUserById method in a UserServiceImpl class.*/

}
