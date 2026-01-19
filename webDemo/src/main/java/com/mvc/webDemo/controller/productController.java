package com.mvc.webDemo.controller;
import com.mvc.webDemo.models.product;
import com.mvc.webDemo.services.productService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.GettMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.service.annotation.GetExchange;
// import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class productController {
    @Autowired
    public productService producteServ;

    @GetMapping("/product")
    public List<product>getData(){
        return producteServ.getServices();
    }
    @GetMapping("/product/{pid}")
    public product getbyID(@PathVariable int pid){
        return producteServ.getbyPid(pid);
    }
    @PostMapping("/product")
    public void getFromClient(@RequestBody product p){
        if (p != null){
            producteServ.addNewData(p);
        }
    }
    @PutMapping("/product")
    public void updateData(@RequestBody product p){
        if (p != null){
            producteServ.updateDetails(p);
        }
    }
    @DeleteMapping("/product/{pid}")
    public void deleteData(@PathVariable int pid){
        producteServ.deleteDetail(pid);
    }
}
