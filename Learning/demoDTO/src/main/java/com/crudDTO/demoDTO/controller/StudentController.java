package com.crudDTO.demoDTO.controller;

import com.crudDTO.demoDTO.entity.Student;
import com.crudDTO.demoDTO.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    StudentService stdService;

    public StudentController(StudentService stdService) {
        this.stdService = stdService;
    }

    public ResponseEntity<Student> entryStudent(@RequestBody Student std){
        System.out.println("Entering in Controller");
        Student stdResponse = stdService.entryStudent(std);
        System.out.println("Exiting from Controller");
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(std);
    }
}
