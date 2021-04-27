package com.swaggerdemo.swaggerdemo;

import com.swaggerdemo.swaggerdemo.model.Student;
import com.swaggerdemo.swaggerdemo.service.StudentMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class LoadStudentData implements CommandLineRunner {

    StudentMapService studentMapService;

    @Autowired
    public LoadStudentData(StudentMapService studentMapService) {
        this.studentMapService = studentMapService;
    }

    @Override
    public void run(String... args) throws Exception {

        Student s1 = new Student(1,"Sajal", "IV", "India");
        Student s2 = new Student(2,"Lokesh", "V", "India");
        Student s3 = new Student(3,"Kajal", "III", "USA");
        Student s4 = new Student(4,"Sukesh", "VI", "USA");
        Student s5= new Student(5,"Sajal", "VI", "USA");

        studentMapService.save(s1);
        studentMapService.save(s2);
        studentMapService.save(s3);
        studentMapService.save(s4);
        studentMapService.save(s5);

    }
}
