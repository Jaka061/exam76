package kg.it.task2.controller;

import kg.it.task2.entity.Student;
import kg.it.task2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student create(@RequestBody Student student){
        return studentService.create(student);
    }

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/name")
    public List<Student> getAllByFullName(String fullName){
        return studentService.getAllByFullName(fullName);
    }
    @DeleteMapping
    public Student deleteById(@RequestParam(name="id") Long id){
        return studentService.deleteById(id);
    }
}
