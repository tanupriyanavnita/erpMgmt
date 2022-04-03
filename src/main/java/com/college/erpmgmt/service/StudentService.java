package com.college.erpmgmt.service;

import com.college.erpmgmt.entities.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student allStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void removeStudent(Long id);
}
