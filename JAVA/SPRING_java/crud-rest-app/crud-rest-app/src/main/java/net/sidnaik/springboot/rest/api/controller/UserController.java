package net.sidnaik.springboot.rest.api.controller;


import lombok.AllArgsConstructor;
import net.sidnaik.springboot.rest.api.entity.User;
import net.sidnaik.springboot.rest.api.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor     //Creating a param constructor haha.. Lombok things
@RequestMapping("api/users")
public class UserController {

    private UserService userService; //injecting the userService Dependency

    //building the user Rest Api
    @PostMapping
public ResponseEntity<User> createUser(@RequestBody User user){   //re see whats object and ref with miss |saw.. it's DI only (RE)
User savedUser = userService.createUser(user);           // UserService object which has a createUser method
return  new ResponseEntity<>(savedUser, HttpStatus.CREATED);
}
//build get user by id REST API
    //http:localhost:8080/api/users/1
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
        User user=userService.getUserById(userId);
        return new ResponseEntity<>(user,HttpStatus.OK);

    }

    // L65 Building GetAllUsers rest API
    // http://localhost:8080/api/users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users =userService.getAlluser();
        return new ResponseEntity<>(users,HttpStatus.OK); //See what's and enum?
    }

    // L65 Building updateUsers rest API
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,
                                           @RequestBody User user){
        user.setId(userId);
        User updatedUser =  userService.updateUser(user);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK);

    }

    //Building Delete User REST Api
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted",HttpStatus.OK);
    }

}
