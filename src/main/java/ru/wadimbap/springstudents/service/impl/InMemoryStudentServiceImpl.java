package ru.wadimbap.springstudents.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.wadimbap.springstudents.repository.InMemoryStudentDAO;
import ru.wadimbap.springstudents.entity.Student;
import ru.wadimbap.springstudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repo;

    @Override
    public List<Student> getAllStudents() {
        return repo.getAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repo.saveStudent(student);
    }

    @Override
    public Student getStudentByEmail(String email) {
        return repo.getStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repo.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repo.deleteStudent(email);
    }
}
