package net.sidnaik.springboot.rest.api.controller;


import lombok.AllArgsConstructor;
import net.sidnaik.springboot.rest.api.entity.User;
import net.sidnaik.springboot.rest.api.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor     //Creating a param constructor haha.. Lombok things
@RequestMapping("api/users")
public class UserController {

    private UserService userService; //injecting the userService Dependency

    //building the user Rest Api
    @PostMapping
public ResponseEntity<User> createUser(@RequestBody User user){   //re see whats object and ref with miss
User savedUser = userService.createUser(user);           // UserService object which has a createUser method
return  new ResponseEntity<>(savedUser, HttpStatus.CREATED);
}
}
