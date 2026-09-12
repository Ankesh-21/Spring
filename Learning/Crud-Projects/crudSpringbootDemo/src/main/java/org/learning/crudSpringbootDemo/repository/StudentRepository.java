package org.learning.crudSpringbootDemo.repository;

import org.learning.crudSpringbootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface StudentRepository extends JpaRepository<Student,Long> {
    public Optional<Student> findByIdAndIsDeletedFalse(Long id);
    public List<Student> findByIsDeletedFalse();
}
