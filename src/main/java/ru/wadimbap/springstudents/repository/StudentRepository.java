package ru.wadimbap.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.wadimbap.springstudents.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteStudentByEmail(String email);
    Student getStudentByEmail(String email);
}
