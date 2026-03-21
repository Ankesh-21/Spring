package com.HH.billing.Controller;
import java.util.*;

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
        ps.add(new Product("Aero Sneakers", "Nike", "10", "Round", "Footwear", 4999));
        ps.add(new Product("Classic T-Shirt", "Adidas", "Large", "Square", "Clothing", 1299));
        ps.add(new Product("Smartwatch Series 5", "Apple", "42mm", "Circular", "Electronics", 29999));
        ps.add(new Product("Wooden Dining Table", "Ikea", "6ft", "Rectangular", "Furniture", 15999));
        ps.add(new Product("Gaming Mouse", "Logitech", "Standard", "Ergonomic", "Electronics", 3499));
        return ps;
    }
}
