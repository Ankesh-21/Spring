package com.ankesh.eCom.controller;

import com.ankesh.eCom.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ankesh.eCom.model.product;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class productController {
    @Autowired
    productService serv;

    @RequestMapping("/")
    public String greet() {
        return "Hello From Ecom Sala";
    }

    @RequestMapping("/products")
    public List<product> getProducts() {
        return serv.getAllProducts();
    }

    @RequestMapping("/product/{id}")
    public product getByid(@PathVariable int id) {
        return serv.getProductByID(id);
    }

    @PostMapping("/product")
    public ResponseEntity<?> getProductData(@RequestPart product p, @RequestPart MultipartFile imgFile) {
        try{
            product p1 = serv.addProduct(p,imgFile);
            return new ResponseEntity<>(p1,HttpStatus.ACCEPTED);
        }
        catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
