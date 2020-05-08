package kg.it.task2.service;

import kg.it.task2.entity.Course;
import kg.it.task2.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceIml implements CourseService {
@Autowired
private CourseRepository courseRepository;

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course create(Course course) {
        return courseRepository.save(course);
    }
}
