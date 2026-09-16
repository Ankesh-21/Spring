package com.crudDTO.demoDTO.service;

import com.crudDTO.demoDTO.entity.Student;
import com.crudDTO.demoDTO.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    StudentRepository stdRepo;

    public StudentService(StudentRepository stdRepo) {
        this.stdRepo = stdRepo;
    }

    public Student entryStudent(Student std){
         Student stdResponse = stdRepo.save(std);
        return stdResponse;
    }
}
