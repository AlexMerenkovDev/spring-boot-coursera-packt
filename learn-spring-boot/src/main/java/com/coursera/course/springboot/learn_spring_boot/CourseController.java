package com.coursera.course.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping ("/courses")
    public List<Course> getPerson(){
        return Arrays.asList(
                new Course (1, "Learn AWS", "in28Minutes"),
                new Course (2, "Learn DevOps", "in28Minutes"),
                new Course (3, "Learn Angular", "in28Minutes"),
                new Course (7, "Learn Angular", "in28Minutes")
        );
    }

}
