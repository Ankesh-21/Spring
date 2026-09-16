package com.crudDTO.demoDTO.repository;

import com.crudDTO.demoDTO.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
