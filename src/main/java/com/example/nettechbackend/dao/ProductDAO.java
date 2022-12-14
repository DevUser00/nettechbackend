package com.example.nettechbackend.dao;

import com.example.nettechbackend.model.Product;
import com.example.nettechbackend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDAO {

  private final ProductRepository productRepository;

  public ProductDAO(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public void saveProduct(Product product){
    productRepository.save(product);
  }
  public Product getProductById(long productId){
    return productRepository.findById(productId).get();
  }

  public List<Product> getAllProducts(){
    return productRepository.findAll();
  }

  public List<Product> getProductListByName(String productName){
    return productRepository.findAllByProductNameContainingIgnoreCase(productName);
  }
}
