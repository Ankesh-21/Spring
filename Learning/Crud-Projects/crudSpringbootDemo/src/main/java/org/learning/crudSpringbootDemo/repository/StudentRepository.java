package org.learning.crudSpringbootDemo.repository;

import org.learning.crudSpringbootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface StudentRepository extends JpaRepository<Student,Long> {
    public Optional<Student> findByIdAndIsDeletedFalse(Long id);
    // JPA Query Naming Rules:
    // findBy + FieldName + condition
    // findAll + And is not possible and also when there is one field don't use And
    public List<Student> findByIsDeletedFalse();
}
