package kg.it.task2.service;

import kg.it.task2.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAll();
    //Course getById(Long id);
    Course create(Course course);
    //void deleteById(Long id);
}
