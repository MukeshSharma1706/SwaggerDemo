package com.swaggerdemo.swaggerdemo.controller;

import com.swaggerdemo.swaggerdemo.model.Student;
import com.swaggerdemo.swaggerdemo.service.StudentMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentMapService studentMapService;

    @GetMapping(path = "/getStudentById/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Integer id){
         if(studentMapService.findById(id).isPresent()) {
             Student student  = studentMapService.findById(id).get();
             return  ResponseEntity.status(HttpStatus.OK).body(student);
         }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body( null);
    }

    @GetMapping(value = "/getStudentByName/{name}")
    public List<Student> getStudentByName(@PathVariable(value = "name") String name) {
        List<Student> studentsByName = studentMapService.findByName(name);
        System.out.println(studentsByName);
        return studentsByName;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        studentMapService.save(student);
        return student;
    }
}
