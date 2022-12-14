//package com.example.nettechbackend.controller;
//
//import com.example.nettechbackend.dto.PostDTO;
//import com.example.nettechbackend.service.PostService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin(origins = "*")
//@RequestMapping("/api/post")
//public class PostController {
//
//
//  private final PostService postService;
//
//  public PostController(PostService postService) {
//    this.postService = postService;
//  }
//
//  @GetMapping("/getallpostfromproduct")
//  public ResponseEntity<?> getAllPostFromProduct(@RequestParam(name = "productId") long productId){
//    return postService.getAllPostFromProduct(productId);
//  }
//
//  @PostMapping("/createpost")
//  public ResponseEntity<?> createPost(@RequestParam(name = "userId") long userId, @RequestParam(name = "productId") long productId, @RequestBody PostDTO postDTO)
//  {
//    return postService.createPost(userId, productId,postDTO);
//  }
//
//}
