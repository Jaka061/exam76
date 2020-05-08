package kg.it.task2.controller;

import kg.it.task2.entity.Course;
import kg.it.task2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course create(Course course){
        return  courseService.create(course);
    }

    @GetMapping
    public List<Course> getAll(){
        return courseService.getAll();
    }


}
