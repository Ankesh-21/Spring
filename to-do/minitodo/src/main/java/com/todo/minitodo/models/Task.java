package com.todo.minitodo.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id ;
    private String taskName;
    private boolean taskStatus;

    public int getTaskId(){
        return this.id;
    }
    public boolean getTaskStatus(){
        return this.taskStatus;
    }
}
