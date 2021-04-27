package com.swaggerdemo.swaggerdemo.service;

import com.swaggerdemo.swaggerdemo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentMapService implements StudentService {

    List<Student> students ;

    @Override
    public Optional<Student> findById(Integer id) {
        return students.stream().filter(s -> s.getId().equals(id)).findFirst();
    }

    @Override
    public List<Student> findByName(String name) {
        System.out.println(name);
        return students.stream().filter(s -> s.getName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public List<Student> findByCountry() {
        return null;
    }

    @Override
    public void save(Student student) {

        if (students == null){
            students = new ArrayList<Student>();
        }
        students.add(student);
    }
}
