package com.ankesh.eCom.service;
import com.ankesh.eCom.model.product;
import com.ankesh.eCom.repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {
    @Autowired
    productRepo repo;
    public List<product> getAllProducts(){
        return repo.findAll();
    }
}
