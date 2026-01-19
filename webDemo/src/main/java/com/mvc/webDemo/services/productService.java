package com.mvc.webDemo.services;
import com.mvc.webDemo.models.*;
import com.mvc.webDemo.repository.productRepo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {

    //List<product>products = new ArrayList<>(Arrays.asList(new product(1, "shoes", 900),new product(2, "shirt", 1000)));
    @Autowired
    productRepo repo;
    public List<product>getServices(){
        return repo.findAll();
    }
    public product getbyPid(int pid){
        return repo.findById(pid).orElse(new product());
    }
    public void addNewData(product p){
        repo.save(p);
        return;
    }
    public void updateDetails(product p){
        repo.save(p);
    }
    public void deleteDetail(int pid){
        repo.deleteById(pid);
    }
}
