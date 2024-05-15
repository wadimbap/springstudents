package ru.wadimbap.springstudents.service;

import ru.wadimbap.springstudents.entity.Student;

import java.util.List;

public interface StudentService {
     List<Student> getAllStudents();
     Student saveStudent(Student student);
     Student getStudentByEmail(String email);
     Student updateStudent(Student student);
     void deleteStudent(String email);
}
