package com.example.nettechbackend.controller;

import com.example.nettechbackend.dto.UserDTO;
import com.example.nettechbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/users")
public class UserController {

  @Autowired
  private UserService service;

  @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_CLIENT')")
  @GetMapping(value = "/me")
  public ResponseEntity<UserDTO> getMe() {
    UserDTO dto = service.getMe();
    return ResponseEntity.ok(dto);
  }
//  public UserController(UserService userService) {
//    this.userService = userService;
//  }
//
//  @GetMapping("/getuserbyid")
//  public ResponseEntity<?> getUserById(@RequestParam(name = "userId") long userId){
//    return userService.getUserById(userId);
//  }
//
//  @PostMapping("/createuser")
//  public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO){
//    return userService.createUser(userDTO);
//  }
//
//  @PostMapping("/loginuser")
//  public ResponseEntity<?> loginUser(@RequestBody UserDTO userDTO){
//    return userService.loginUser(userDTO);
//  }
//
//  @PostMapping("/addproducttofavoritelist")
//  public ResponseEntity<?> addProductToFavoriteProducts(@RequestParam(name = "userId") long userId,@RequestParam(name = "productId") long productId){
//    return userService.addProductToFavoriteProducts(userId, productId);
//  }
//
//  @PostMapping("/addproducttocardlist")
//  public ResponseEntity<?> addProductToCardProducts(@RequestParam(name = "userId") long userId,@RequestParam(name = "productId") long productId){
//    return userService.addProductToCardProducts(userId, productId);
//  }
}
