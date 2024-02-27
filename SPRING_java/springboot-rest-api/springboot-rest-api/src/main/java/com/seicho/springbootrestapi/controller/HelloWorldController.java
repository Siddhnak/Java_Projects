package com.seicho.springbootrestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller //Let's make this Java class as a spring MVC controller
@ResponseBody //whenever we develop the restful web services using spring MVC then
// all the rest API's return So in order to convert a Java object into JSON

@RestController//Shortcut which has both of the annotation above
public class HelloWorldController {
    // We just have to create a method and we use spring annotations to make that method as a rest API.

//HTTP GET Request
//http://localhost:8080/hello-world

    @GetMapping("/hello-world") // incoming HTTP get request onto specific handler method
    public String helloWorld(){
        return "Hello World";
    }
}
