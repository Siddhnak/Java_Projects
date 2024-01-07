package net.sidnaik.springboot.rest.api.controller;


import lombok.AllArgsConstructor;
import net.sidnaik.springboot.rest.api.dto.UserDto;
import net.sidnaik.springboot.rest.api.exception.ErrorDetails;
import net.sidnaik.springboot.rest.api.exception.ResNotFoundException;
import net.sidnaik.springboot.rest.api.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor     //Creating a param constructor haha.. Lombok things
@RequestMapping("api/users")
public class UserController {

    private UserService userService; //injecting the userService Dependency

    //building the user Rest Api
    @PostMapping
public ResponseEntity<UserDto> createUser(@RequestBody UserDto user){   //re see whats object and ref with miss |saw.. it's DI only (RE)
UserDto savedUser = userService.createUser(user);           // UserService object which has a createUser method
return  new ResponseEntity<>(savedUser, HttpStatus.CREATED);
}
//build get user by id REST API
    //http:localhost:8080/api/users/1
    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId){
        UserDto user=userService.getUserById(userId);
        return new ResponseEntity<>(user,HttpStatus.OK);

    }

    // L65 Building GetAllUsers rest API
    // http://localhost:8080/api/users
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> users =userService.getAlluser();
        return new ResponseEntity<>(users,HttpStatus.OK); //See what's and enum?
    }

    // L65 Building updateUsers rest API
    @PutMapping("{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId,
                                           @RequestBody UserDto user){
        user.setId(userId);
        UserDto updatedUser =  userService.updateUser(user);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK);

    }

    //Building Delete User REST Api
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted",HttpStatus.OK);
    }

/*
Controller specific exceptions
    lets see how to handle specific exceptions with respect to the controller.
*/
//Putting the rest of the below code in the same class..
//    @ExceptionHandler(ResNotFoundException.class)
//    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResNotFoundException exception,
//                                                                        WebRequest webRequest){
//ErrorDetails errorDetails = new ErrorDetails(
//        LocalDateTime.now(),
//        exception.getMessage(),
//        webRequest.getDescription(false),
//"USER_NOT_FOUND"
////        web
//
//);
//return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
//    }
}
