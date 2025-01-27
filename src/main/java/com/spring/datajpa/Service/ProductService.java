package com.spring.datajpa.Service;

import com.spring.datajpa.Model.Products;
import com.spring.datajpa.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Products> getAllProducts(){
        //System.out.println(productRepository.findAll());
        return productRepository.findAll();
    }

    public Products getProductById(int id){
        return productRepository.findById(id).orElse(new Products());
    }

    public void AddProduct(Products prod) {
        productRepository.save(prod);
    }


    public void UpdateProduct(Products prod) {
        productRepository.save(prod);
    }


    public void DeleteProduct(int id){
        productRepository.deleteById(id);
    }
}
