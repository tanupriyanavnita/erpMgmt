package com.college.erpmgmt;

import com.college.erpmgmt.DAO.StudentDAO;
import com.college.erpmgmt.entities.Student;
import com.mysql.cj.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.lang.module.Configuration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ErpMgmtApplicationTests {

    @Autowired
    private StudentDAO studentDAO;

    private static SessionFactory factory;

    @Test
    public void studentEntity_whenSaveAndRetrieveEntity_Then_OK()
    {
        Student savedEntity = studentDAO.save(new Student("Smriti","Sah","IT","Ranchi"));
        Student foundEntity = studentDAO.getById(savedEntity.getid());
        assertNotNull(foundEntity);
        assertEquals(savedEntity.getFirstName(),foundEntity.getFirstName());


    }

}
