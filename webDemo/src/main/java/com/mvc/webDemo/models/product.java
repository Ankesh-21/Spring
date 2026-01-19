package com.mvc.webDemo.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
// import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class product {
    @Id
    private int productID;
    private String productName;
    private int price;

    // public product(int id,String name,int price){
    //     this.price = price;
    //     this.productID = id;
    //     this.productName = name;
    // }
    public int getId(){
        return this.productID;
    }
}
