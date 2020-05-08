package kg.it.task2.service;

import kg.it.task2.entity.Course;
import kg.it.task2.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student getById(Long id);
    Student create(Student student);
    Student deleteById(Long id);
    List<Student> getAllByFullName(String fullName);

}
