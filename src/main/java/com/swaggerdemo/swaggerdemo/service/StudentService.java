package com.swaggerdemo.swaggerdemo.service;

import com.swaggerdemo.swaggerdemo.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Optional<Student> findById(Integer id);
    List<Student> findByName(String name);
    List<Student> findByCountry();
    void save(Student student);
}
