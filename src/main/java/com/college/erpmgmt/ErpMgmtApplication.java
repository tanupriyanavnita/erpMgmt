package com.college.erpmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpMgmtApplication{


    public static void main(String[] args)
    {
        SpringApplication.run(ErpMgmtApplication.class, args);
        /*ApplicationContext context = SpringApplication.run(ErpMgmtApplication.class, args);
        StudentRepository studentRepository = context.getBean(StudentRepository.class);
        Student st = new Student();
        st.setFirstName("Tanu");
        st.setLastName("Priya");
        st.setBranch("CSE");
        st.setAddress("Bgp");
        Student st1 = studentRepository.save(st);
        System.out.println(st1);
        *//* Optional<Student> st2 = studentRepository.findById(1);
        Student value = st2.orElseThrow(() ->
                new RuntimeException("No such data found"));*/

    }

}
