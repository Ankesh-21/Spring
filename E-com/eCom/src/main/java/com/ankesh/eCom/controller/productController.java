package com.ankesh.eCom.controller;

import com.ankesh.eCom.service.productService;

import lombok.RequiredArgsConstructor;
import tools.jackson.databind.ObjectMapper;

import org.springframework.http.MediaType;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.GetMapping;
import com.ankesh.eCom.model.product;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
@RequiredArgsConstructor
public class productController {
    // @Autowired
    private final productService serv;

    @RequestMapping("/")
    public String greet() {
        return "Hello From Ecom Sala";
    }

    @RequestMapping("/products")
    public List<product> getProducts() {
        return serv.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public product getByid(@PathVariable int id) {
        return serv.getProductByID(id);
    }

    @PostMapping(value = "/product", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public ResponseEntity<?> getProductData(
            @RequestPart("product") product product, // Let Spring handle the conversion
            @RequestPart("imageFile") MultipartFile imgFile) {
        try {
            System.out.println("Mapped Product: " + product);
            /*
             * // You can still print it to verify
             * System.out.println("Mapped Product: " + product);
             */
            product p1 = serv.addProduct(product, imgFile);
            return new ResponseEntity<>(p1, HttpStatus.CREATED);
        } catch (Exception e) {
            /*
             * // Log the full error to your console so you can see what went wrong
             */
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/product/{pid}/image")
    public ResponseEntity<byte[]> getImageData(@PathVariable int pid) {
        product fetchedProduct = serv.getProductByID(pid);
        byte[] imageFile = fetchedProduct.getImageData();
        return ResponseEntity.ok()
        .contentType(MediaType.valueOf(fetchedProduct.getImageType()))
        .body(imageFile);
    }
}
