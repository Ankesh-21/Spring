package com.ankesh.eCom.service;
import com.ankesh.eCom.model.product;
import com.ankesh.eCom.repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class productService {
    @Autowired
    productRepo repo;
    public List<product> getAllProducts(){
        return repo.findAll();
    }

    public product getProductByID(int id){
        return repo.findById(id).orElse(null);
    }
    public product addProduct(product p,MultipartFile imgFile) throws IOException{
        p.setImageName(imgFile.getOriginalFilename());
        p.setImageType(imgFile.getContentType());
        p.setImageData(imgFile.getBytes()); // converting in byte data
        return repo.save(p);
    }
}
