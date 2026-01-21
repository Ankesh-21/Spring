package com.ankesh.eCom.controller;

import com.ankesh.eCom.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ankesh.eCom.model.product;

import java.util.List;

@RestController
@RequestMapping("/api")
public class productController {
    @Autowired
    productService serv;
    @RequestMapping("/")
    public String greet(){
        return "Hello From Ecom Sala";
    }
    @RequestMapping("/products")
    public List<product> getProducts(){
        return serv.getAllProducts();
    }
}
