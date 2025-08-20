package com.example.Course_Register.controller;

import com.example.Course_Register.model.Course;
import com.example.Course_Register.model.CourseRegistry;
import com.example.Course_Register.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
       return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String enrollCourses(@RequestParam("name") String name,@RequestParam("emailId") String emailId,
                                @RequestParam("courseName") String courseName){
       courseService.enrollCourse(name,emailId,courseName);
       return "Congratulations!"+name+ "Enrollment successful for"+courseName;
    }


}
