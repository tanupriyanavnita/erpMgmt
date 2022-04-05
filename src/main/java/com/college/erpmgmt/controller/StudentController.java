package com.college.erpmgmt.controller;

import com.college.erpmgmt.entities.Student;
import com.college.erpmgmt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents()
    {
        return this.studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable String id)
    {
        return this.studentService.getStudentById(Long.parseLong(id));
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student)
    {
        return this.studentService.allStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student)
    {
        return this.studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<HttpStatus> removeStudent(@PathVariable String id)
    {
        try {
            this.studentService.removeStudent(Long.parseLong(id));
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e)
        {
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
