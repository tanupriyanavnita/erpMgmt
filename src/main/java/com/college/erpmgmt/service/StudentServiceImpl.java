package com.college.erpmgmt.service;

import com.college.erpmgmt.DAO.StudentDAO;
import com.college.erpmgmt.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudents() {
        return this.studentDAO.findAll();
    }

    @Override
    public Student allStudent(Student student) {
        this.studentDAO.save(student);
        return student;
    }

    @Override
    public Student getStudentById(Long id) {
        return this.studentDAO.getById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        this.studentDAO.save(student);
        return student;
    }

    @Override
    public void removeStudent(Long id) {
        Student student = this.studentDAO.getById(id);
        this.studentDAO.delete(student);
    }
}
