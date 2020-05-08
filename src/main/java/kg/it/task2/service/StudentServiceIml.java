package kg.it.task2.service;

import kg.it.task2.entity.Student;
import kg.it.task2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceIml implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student deleteById(Long id) {
        Student student=getById(id);
        studentRepository.deleteById(id);
        return student;
    }

    @Override
    public List<Student> getAllByFullName(String fullName) {
        return studentRepository.findAllByFullNameContainingIgnoringCase(fullName);
    }
}
