package com.todo.minitodo.service;
import java.util.List;
import com.todo.minitodo.models.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.todo.minitodo.repository.DB;

@Service
public class todoService {
    @Autowired
    DB db;
    public List<Task>getAllTask(){
        return db.findAll();
    }
    public Task addTask(Task task){
        return db.save(task);
    }
    public Task updatetask(int tid,Task task){
        Task t = db.findById(tid).orElse(null);
        t.setTaskName(task.getTaskName());
        t.setTaskStatus(task.getTaskStatus());
        t = db.save(t);
        return t;
    }
    public void deleteTask(int tid){
        db.deleteById(tid);
    }
}
