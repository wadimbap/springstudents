package ru.wadimbap.springstudents.repository;

import org.springframework.stereotype.Repository;
import ru.wadimbap.springstudents.entity.Student;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryStudentDAO {
    private final List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student getStudentByEmail(String email) {
        return students.stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public Student updateStudent(Student updatedStudent) {
        int oldStudent = students.indexOf(getStudentByEmail(updatedStudent.getEmail()));
        return students.set(oldStudent, updatedStudent);
    }

    public void deleteStudent(String email) {
        students.removeIf(student -> student.getEmail().equals(email));
    }
}
