package com.HH.billing.Controller;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.HH.billing.Models.Product;
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class HHcontroller {
    @GetMapping("/greet")
    public String Greet(){
        return "Hello World!!";
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        List<Product> ps = new ArrayList<>();
        String line;
        String csvSeperater = ",";
        int cnt = 0;
        String FilePath = "C:\\Users\\hatui\\Desktop\\myKernel\\Spring\\HH\\billing\\src\\main\\java\\com\\HH\\billing\\Controller\\cpvc_full_dataset.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(FilePath))){
            while((line = br.readLine()) != null){
                String[] values = line.split(csvSeperater);
//                int id = Integer.parseInt(values[0]);
                if (cnt == 0){
                    cnt ++;
                    continue;
                }
                String product_name = values[1];
                String category = values[2];
                String size_inch = values[3];
                String size_mm = values[4];
                String pkg = values[5];
                float mrp = Float.parseFloat(values[6]);
                ps.add(new Product(product_name,category,size_inch,size_mm,mrp));

                cnt ++;
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return ps;
    }
}
