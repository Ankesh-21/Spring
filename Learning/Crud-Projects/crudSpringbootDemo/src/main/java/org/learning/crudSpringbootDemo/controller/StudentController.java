package org.learning.crudSpringbootDemo.controller;

//import org.springframework.stereotype.Component;
import org.learning.crudSpringbootDemo.entity.Student;
import org.learning.crudSpringbootDemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    /**
    // Constructor Injection

     **/
    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
     }

    // Create Student
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println("Entering the controller");
        Student stdResp = studentService.createStd(student);
        System.out.println("Exiting controller");
        return ResponseEntity.status(HttpStatus.CREATED).body(stdResp);
    }

    // Read one student
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student studentResp = studentService.getStudent(id);
        if (studentResp == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(studentResp);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAll(){
        List<Student> stds = studentService.getAllStudents();
        if (stds.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(stds);
    }
    // update Student
    @PutMapping("/updateInfo/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id,@RequestBody Student newStudentInfo){
        Student updatedInfo = studentService.updateStudent(id,newStudentInfo);
        if (updatedInfo == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(updatedInfo);
    }
    // delete student
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudentInfo(@PathVariable Long id){
        Boolean isDeleted = studentService.deleteStudent(id);
        if (isDeleted == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.FOUND).body("Record Deleted");
    }
}
