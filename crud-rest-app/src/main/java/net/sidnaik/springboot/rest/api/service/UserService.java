package net.sidnaik.springboot.rest.api.service;

import net.sidnaik.springboot.rest.api.entity.User;



public interface UserService {
User createUser(User user);

//User getUserById(Long userId); /* CSR reason meth here| let's go and let's implement this
//                                    getUserById method in a UserServiceImpl class.*/

}
