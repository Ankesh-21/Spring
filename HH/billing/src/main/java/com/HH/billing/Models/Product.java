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
    private String name;
    private String brand;
    private String size;
    private String shape;
    private String category;
    private Integer price;

    public Product(String name,String brand,String size,String shape,String category,int price){
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.shape = shape;
        this.size = size;
        this.price = price;
    }
}
