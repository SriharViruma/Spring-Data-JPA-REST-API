package com.spring.datajpa.Repo;

import com.spring.datajpa.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends JpaRepository<Products,Integer> {
}
