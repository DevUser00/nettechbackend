package com.example.nettechbackend.service;

import com.example.nettechbackend.dao.ProductDAO;
import com.example.nettechbackend.dto.ProductDTO;
import com.example.nettechbackend.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  private final ProductDAO productDAO;

  public ProductService(ProductDAO productDAO) {
    this.productDAO = productDAO;
  }

  public List<Product> getAllProducts(){
    return productDAO.getAllProducts();
  }

  public ResponseEntity<?> getProductById(long productId)
  {
    try
    {
      Product product = productDAO.getProductById(productId);
      return new ResponseEntity<>(product, HttpStatus.OK);
    }
    catch (Exception e)
    {
      return new ResponseEntity<>("product not founded",HttpStatus.NOT_FOUND);
    }
  }

  public ResponseEntity<?> createProduct(ProductDTO productDTO)
  {
    System.out.println("ACESSO AUTORIZADO");
    try
    {
      Product product = new Product();
      product.setProductName(productDTO.getProductName());
      product.setProductPrice(productDTO.getProductPrice());
      product.setProductDescription(productDTO.getProductDescription());
      product.setProductImageUrl(productDTO.getProductImageUrl());

      productDAO.saveProduct(product);
      return new ResponseEntity<>("product created", HttpStatus.CREATED);
    }
    catch (Exception e)
    {
      return new ResponseEntity<>("product not created", HttpStatus.NOT_IMPLEMENTED);
    }
  }

  public List<Product> filterListProductByName(String productName) {

    return productDAO.getProductListByName(productName);
  }
}
