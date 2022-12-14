package com.example.nettechbackend.controller;

import com.example.nettechbackend.dto.ProductDTO;
import com.example.nettechbackend.model.Product;
import com.example.nettechbackend.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/product")
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/getallproducts")
  public List<Product> getAllProducts(){
    return productService.getAllProducts();
  }

  @GetMapping("/getproductbyid")
  public ResponseEntity<?> getProductById(@RequestParam(name = "productId") long productId) {
    return productService.getProductById(productId);
  }

  @PostMapping("/createproduct")
  public ResponseEntity<?> createProduct(@RequestBody ProductDTO productDTO){
    return productService.createProduct(productDTO);
  }

  @GetMapping("/filterproductbyname")
  public List<Product> filterListProductByName(@RequestParam(name ="productName") String productName)
  {
    return productService.filterListProductByName(productName);
  }
}
