package com.example.nettechbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String productImageUrl;

  private String productName;

  private double productPrice;

  private String productDescription;

//  @ManyToMany(mappedBy = "favoriteProducts")
//  @JsonIgnore
//  private Set<User> favoriteUsers = new HashSet<>();

//  @OneToMany(mappedBy = "product")
//  private List<Post> posts = new ArrayList<>();

  public long getProductId() {
    return id;
  }

  public String getProductImageUrl() {
    return productImageUrl;
  }

  public void setProductImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }

  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }


//
//  public List<Post> getPosts() {
//    return posts;
//  }
//
//  public void setPosts(Post newPost) {
//     posts.add(newPost);
//  }
}
