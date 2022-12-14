package com.example.nettechbackend.repository;

import com.example.nettechbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


  List<Product> findAllByProductNameContainingIgnoreCase(@Param("productName") String productName);
}
