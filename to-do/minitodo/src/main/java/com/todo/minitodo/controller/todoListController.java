package com.todo.minitodo.controller;

import java.util.*;
import com.todo.minitodo.models.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.todo.minitodo.service.todoService;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class todoListController {
    @Autowired
    todoService serv;
    // List<Task> tasks = new ArrayList<>();
    @GetMapping("/tasks")
    public List<Task>homeData(){
        return serv.getAllTask();
    }
    @PostMapping("/addNew")
    public ResponseEntity<Task>addNewTask(@RequestBody Task task){
        Task t = serv.addTask(task);
        return new ResponseEntity<>(t,HttpStatus.CREATED);
    }
    @PutMapping("/{tid}/update")
    public ResponseEntity<Task>updateTask(@RequestBody Task task,@PathVariable int tid){
        Task t = serv.updatetask(tid,task);
        return new ResponseEntity<>(t,HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/{tid}/delete")
    public ResponseEntity<?>deleteTask(@PathVariable int tid){
        serv.deleteTask(tid);
        return ResponseEntity.ok(null);
    }
}
