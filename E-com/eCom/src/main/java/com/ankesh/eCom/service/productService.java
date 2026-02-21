package com.ankesh.eCom.service;
import com.ankesh.eCom.model.product;
import com.ankesh.eCom.repository.productRepo;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class productService {
    private final productRepo repo;
    public List<product> getAllProducts(){
        return repo.findAll();
    }

    public product getProductByID(int id){
        return repo.findById(id).orElse(null);
    }
    public product addProduct(product p,MultipartFile imgFile) throws IOException{
        if (imgFile != null && !imgFile.isEmpty()) {
            p.setImageName(imgFile.getOriginalFilename());
            p.setImageType(imgFile.getContentType());
            p.setImageData(imgFile.getBytes()); // converting in byte data
        }
        return repo.save(p);
    }
    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
