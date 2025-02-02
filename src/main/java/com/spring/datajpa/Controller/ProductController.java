package com.spring.datajpa.Controller;

import com.spring.datajpa.Model.Products;
import com.spring.datajpa.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Products> getProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("product/{id}")
    public Products getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/product")
    public ResponseEntity<Integer> AddProduct(@RequestBody Products prod){
        productService.AddProduct(prod);
        return ResponseEntity.ok(200);
    }

    @PutMapping("/product")
    public void UpdateProduct(@RequestBody Products prod){
        productService.UpdateProduct(prod);
    }

    @DeleteMapping("/product/{id}")
    public void DeleteProduct(@PathVariable int id){
        productService.DeleteProduct(id);
    }

}