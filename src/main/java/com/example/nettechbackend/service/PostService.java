//package com.example.nettechbackend.service;
//
//import com.example.nettechbackend.dao.PostDAO;
//import com.example.nettechbackend.dao.ProductDAO;
//import com.example.nettechbackend.dao.UserDAO;
//import com.example.nettechbackend.dto.PostDTO;
//import com.example.nettechbackend.model.Post;
//import com.example.nettechbackend.model.Product;
//import com.example.nettechbackend.model.UserOLD;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Service
//public class PostService {
//
//  private final PostDAO postDAO;
//  private final UserDAO userDAO;
//  private final ProductDAO productDAO;
//
//  public PostService(PostDAO postDAO, UserDAO userDAO, ProductDAO productDAO) {
//    this.postDAO = postDAO;
//    this.userDAO = userDAO;
//    this.productDAO = productDAO;
//  }
//
//  public ResponseEntity<?> getAllPostFromProduct(@RequestParam(name = "productId") long productId){
//    try
//    {
//      Product product = productDAO.getProductById(productId);
//
//      return new ResponseEntity<>(product.getPosts(),HttpStatus.OK);
//    }
//    catch (Exception e)
//    {
//      return new ResponseEntity<>("product not founded",HttpStatus.NOT_FOUND);
//
//    }
//  }
//
//  public ResponseEntity<?> createPost(@RequestParam(name = "userId") long userId, @RequestParam(name = "productId") long productId, PostDTO postDTO)
//  {
//    try
//    {
//
//      UserOLD user = userDAO.getUserById(userId);
//      Product product = productDAO.getProductById(productId);
//
//      Post post = new Post();
//      post.setTitle(postDTO.getTitle());
//      post.setContent(postDTO.getContent());
//      post.setUser(user);
//      post.setProduct(product);
//
//      user.setPosts(post);
//      product.setPosts(post);
//
//      postDAO.savePost(post);
//      return new ResponseEntity<>("post created", HttpStatus.CREATED);
//    }
//    catch (Exception e)
//    {
//      return new ResponseEntity<>("post not created", HttpStatus.NOT_IMPLEMENTED);
//    }
//  }
//}
