package com.microservices.product.repository;

import com.microservices.product.entity.Category;
import com.microservices.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    public List<Product> findByCategory(Category category);
}
