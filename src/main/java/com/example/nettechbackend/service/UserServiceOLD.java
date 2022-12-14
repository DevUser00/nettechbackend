//package com.example.nettechbackend.service;
//
//import com.example.nettechbackend.dao.ProductDAO;
//import com.example.nettechbackend.dao.RoleDAO;
//import com.example.nettechbackend.dao.UserDAO;
//import com.example.nettechbackend.dto.UserDTO;
//import com.example.nettechbackend.model.Product;
//import com.example.nettechbackend.model.RoleOLD;
//import com.example.nettechbackend.model.UserOLD;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UserServiceOLD {
//
//  private final AuthenticationManager authenticationManager;
//  private final TokenService tokenService;
//  private final UserDAO userDAO;
//
//  private final PasswordEncoder passwordEncoder;
//  private final ProductDAO productDAO;
//
//  private final RoleDAO roleDAO;
//
//  public UserServiceOLD(AuthenticationManager authenticationManager, TokenService tokenService, UserDAO userDAO, PasswordEncoder passwordEncoder, ProductDAO productDAO, RoleDAO roleDAO) {
//    this.authenticationManager = authenticationManager;
//    this.tokenService = tokenService;
//    this.userDAO = userDAO;
//    this.productDAO = productDAO;
//    this.passwordEncoder=passwordEncoder;
//    this.roleDAO = roleDAO;
//  }
//
//  public ResponseEntity<?> getUserById(long userId){
//
//    try
//    {
//      UserOLD user = userDAO.getUserById(userId);
//
//      return new ResponseEntity<>(user,HttpStatus.OK);
//    }
//    catch (Exception e)
//    {
//      return new ResponseEntity<>("user not founded",HttpStatus.NOT_FOUND);
//    }
//  }
//
//  public ResponseEntity<?> createUser(UserDTO userDTO){
//
//    Optional<UserOLD> user = userDAO.getUserByEmail(userDTO.getEmail());
//    if(!user.isPresent())
//    {
//      String token  = tokenService.createTokenJwt(userDTO.getEmail());
//
//      UserOLD newUser = new UserOLD();
//      newUser.setEmail(userDTO.getEmail());
//      newUser.setPassword(passwordEncoder.encode(userDTO.getPassword()));
//      newUser.setUsername(userDTO.getUsername());
//      newUser.setToken(token);
//
//      RoleOLD role = new RoleOLD();
//      role.setName("user");
//      role.setUsers(newUser);
//      roleDAO.saveRole(role);
//
//      newUser.setRoles(role);
//      userDAO.saveUser(newUser);
//
//      return new ResponseEntity<>(token,HttpStatus.OK);
//    }
//    else
//    {
//      return new ResponseEntity<>("E-mail already exists.",HttpStatus.NOT_IMPLEMENTED);
//    }
//  }
//
//  public ResponseEntity<?> loginUser(UserDTO userDTO){
//
//    Optional<UserOLD> user = userDAO.getUserByEmail(userDTO.getEmail());
//
//    if(user.isPresent() && passwordEncoder.matches(userDTO.getPassword(), user.get().getPassword()))
//    {
//      return ResponseEntity.ok(user.get().getToken());
//    }
//    else if(!user.isPresent())
//    {
//      return ResponseEntity.notFound().build();
//    }
//    else
//    {
//      return new ResponseEntity<>("invalid password", HttpStatus.CONFLICT);
//    }
//  }
//
//
//  public ResponseEntity<?> addProductToFavoriteProducts(long userId, long productId){
//
//    UserOLD user = userDAO.getUserById(userId);
//    Product product = productDAO.getProductById(productId);
//
//    try
//    {
//      user.setFavoriteProducts(product);
//      product.setFavoriteUsers(user);
//      productDAO.saveProduct(product);
//      return new ResponseEntity<>("product added sucessfuly",HttpStatus.OK);
//    }
//    catch (Exception e)
//    {
//      return new ResponseEntity<>("wasn't able to add the product to favorite list",HttpStatus.NOT_IMPLEMENTED);
//    }
//  }
//
//  public ResponseEntity<?> addProductToCardProducts(long userId,long productId)
//  {
//    UserOLD user = userDAO.getUserById(userId);
//    Product product = productDAO.getProductById(productId);
//
//    try
//    {
//      return new ResponseEntity<>("product added sucessfuly",HttpStatus.OK);
//    }
//    catch (Exception e)
//    {
//      System.out.println(e);
//      return new ResponseEntity<>("wasn't able to add the product to card list",HttpStatus.NOT_IMPLEMENTED);
//
//    }
//  }
//
//
//}
