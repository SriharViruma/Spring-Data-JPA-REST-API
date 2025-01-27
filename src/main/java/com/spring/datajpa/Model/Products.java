package com.spring.datajpa.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("price")
    private double price;

    @JsonProperty("quantity")
    private int quantity;

//    @Override
//    public String toString(){
//        return "id: "+id+
//                        "\n name:"+name+
//                        "\n price: "+price+
//                        "\n quantity: "+quantity;
//    }

}
