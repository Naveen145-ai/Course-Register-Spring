package com.example.Course_Register.controller;

import com.example.Course_Register.model.Course;
import com.example.Course_Register.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController   //This objects can be managed by spring
public class CourseController {

    @Autowired //for injecting the availbale object ,object availble in the service @Service
    CourseService courseService;  //this create object for service
   @GetMapping("courses") //this for create get pai with name courses
    public List<Course> availableCourses(){

        return courseService.availableCourses();

    }
}
