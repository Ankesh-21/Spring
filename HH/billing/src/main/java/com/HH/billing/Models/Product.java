package com.HH.billing.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // id,product_name,category,size_inch,nominal_size_mm,std_pkg_bag,mrp
    private String product_name;
    private String category;
    private String size_inch;
    private String nominal_size_mm;
    private String std_pkg_bag;
    private Float mrp;

    public Product(String name,String category,String size,String size_mm,Float price){
        this.product_name = name;
        this.category = category;
        this.nominal_size_mm = size_mm;
        this.size_inch = size;
        this.mrp = price;
    }
}
