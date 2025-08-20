package com.example.Course_Register.service;


import com.example.Course_Register.model.Course;
import com.example.Course_Register.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //this for object available in ioc container
public class CourseService {

        @Autowired
        CourseRepo courseRepo;
    public List<Course> availableCourses(){
        return courseRepo.findAll();
    }
}
