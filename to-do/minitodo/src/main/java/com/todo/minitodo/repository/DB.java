package com.todo.minitodo.repository;
import com.todo.minitodo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DB extends JpaRepository<Task,Integer>{
    
}
