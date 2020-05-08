package kg.it.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name="student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;
    @Column(name="registration_time")
    private LocalDateTime registrationTime;
    @Column(name="cource_cost")
    private Integer courceCost;

}
