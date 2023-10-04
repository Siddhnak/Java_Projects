package com.seicho.springbootrestapi.controller;

import com.seicho.springbootrestapi.bean.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//STep II to create a controller class.
@RestController // (annotation to make this class as a spring MVC REST controller.
public class StudentController {

    @GetMapping ("student")//We use @GetMapping annotation to map incoming HTTP GET request with this method.
    public Student getStudent(){
        Student student =new Student(1,"Siddhant" ,"Naik");
        return student;
    }
    @GetMapping("students") //from 48
    public List<Student> getStudents(){
        List<Student> students= new ArrayList<>();
        students.add(new Student(1,"Siddhant","Naik"));
        students.add(new Student(2,"Mikano","kazu"));
        students.add(new Student(3,"Eren","Yeager"));
        students.add(new Student(4,"Zeke","Yeager"));
        return students;
    }
    //Spring BOOT REST API with path variable || from 49
    @GetMapping("students/{id}")//url template variable
//    public Student studentPathVariable(@PathVariable int id){ //same name as method arg
    public Student studentPathVariable(@PathVariable("id") int studentId){ //Use if different method argument
return new Student(studentId,"HulkHogan","kaka");
    }

    //Spring BOOT REST API with multi path variable || from mid 49
    @GetMapping("students/{id}/{first-name}/{last-name}")//url template variable
//    public Student studentPathVariable(@PathVariable int id){ //same name as method arg
    public Student studentMultiPathVariable(@PathVariable("id") int studentId,
                                            @PathVariable("first-name")String firstName,
                                            @PathVariable("last-name")String lastName
                                            )
    { //Use if different method argument
        return new Student(studentId,firstName,lastName);
    }

//    //Spring Boot REST api without Request Param[PRACTICE]
//    //http://localhost:8080/cmate/black/Akash
//    @GetMapping("cmate/{skin-color}/{first-name}")
//    public Student Cmate(@PathVariable("skin-color")String skinColor
////                         @PathVariable("first-name")String firstName //Commented out as compiler said method with 2 params exists..
//    ){
//        return new Student(skinColor);
//    }

    //Spring Boot REST api with Request Param
    //http://localhost:8080/cmate/query?skinColor=Black&firstName=Banga&eyeColor=Blue
//    @GetMapping("cmate/query")
//    public Student Cmate(@RequestParam String skinColor,
//                         @RequestParam String firstName,
//                         @RequestParam String eyeColor
//    ){
//        return new Student(skinColor,firstName,eyeColor);
//    }

//L51
    /*Spring Boot Rest API that will handle HTTP POST REQ
    * 2 imp @PostMapping & @RequestBody*/
@PostMapping("students/create") //Well, here we are using @PostMapping annotation to map incoming HTTP POST to request to this method.
public Student createStudent (@RequestBody Student student) { //Well, @RequestBody annotation is responsible to retrieve a JSON object from this request and it
    System.out.println(student.getId());
    System.out.println(student.getFirstName());
    System.out.println(student.getLastName());
//    System.out.println(student.getSkinColor());
//    System.out.println(student.getEyeColor());
    return student;
}
}
