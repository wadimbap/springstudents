package ru.wadimbap.springstudents.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.wadimbap.springstudents.entity.Student;
import ru.wadimbap.springstudents.repository.StudentRepository;
import ru.wadimbap.springstudents.service.StudentService;

import java.util.List;
@Service
@Primary
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student getStudentByEmail(String email) {
        return repository.getStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        repository.deleteStudentByEmail(email);
    }
}
