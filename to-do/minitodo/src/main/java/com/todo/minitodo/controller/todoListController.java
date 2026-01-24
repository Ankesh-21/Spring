package com.todo.minitodo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoListController {
    @GetMapping("/")
    public String homeData(){
        return "Hello From Home !!";
    }
}
