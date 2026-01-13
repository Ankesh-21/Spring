package com.injection.InjectionExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    // Field Injection (autowired Required)
    @Autowired
    private Laptop laptop;
    // Constructor Injection
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }
    // setter Injection
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Building Something....");
        laptop.code();
    }
};
