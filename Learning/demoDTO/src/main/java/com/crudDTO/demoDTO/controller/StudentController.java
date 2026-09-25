package com.crudDTO.demoDTO.controller;
import com.crudDTO.demoDTO.dto.createStudentDTO;
import com.crudDTO.demoDTO.entity.Student;
import com.crudDTO.demoDTO.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    StudentService stdService;
    Student student;
    public StudentController(StudentService stdService) {
        this.stdService = stdService;
    }
    @PostMapping("/createStudent")
    public ResponseEntity<Student> entryStudent(@RequestBody createStudentDTO std){
//        std.setDeleted(false);
        Student stdResponse = stdService.createStudent(std);
        return ResponseEntity.ok(stdResponse);
    }
}
