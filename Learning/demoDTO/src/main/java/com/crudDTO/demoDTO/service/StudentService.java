package com.crudDTO.demoDTO.service;

import com.crudDTO.demoDTO.dto.createStudentDTO;
import com.crudDTO.demoDTO.entity.Student;
import com.crudDTO.demoDTO.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class StudentService {
    StudentRepository stdRepo;

    public StudentService(StudentRepository stdRepo) {
        this.stdRepo = stdRepo;
    }

    public Student createStudent(createStudentDTO stdDTO){
        Student mappedStudent = mapToEntity(stdDTO);
        stdRepo.save(mappedStudent);
        return mappedStudent;
    }
    private Student mapToEntity(createStudentDTO stdDTO){
        Student student = new Student();
        student.setName(stdDTO.getName());
        student.setEmail(stdDTO.getEmail());
        student.setRollNo(stdDTO.getRollNo());
        student.setDeleted(false);
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());
        return student;
    }
}
