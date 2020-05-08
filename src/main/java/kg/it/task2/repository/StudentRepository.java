package kg.it.task2.repository;

import kg.it.task2.entity.Course;
import kg.it.task2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findAllByFullNameContainingIgnoringCase(String fullName);
}
