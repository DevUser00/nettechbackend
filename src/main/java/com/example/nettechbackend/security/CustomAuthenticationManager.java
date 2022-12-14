//package com.example.nettechbackend.security;
//
//import com.example.nettechbackend.dao.UserDAO;
//import com.example.nettechbackend.model.UserOLD;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//
//public class CustomAuthenticationManager implements AuthenticationManager {
//
//  @Autowired
//  private UserDAO userDAO;
//
//  @Autowired
//  private PasswordEncoder passwordEncoder;
//
//
//  @Override
//  @Transactional
//  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//    try
//    {
//      UserOLD user = userDAO.getUserByEmail(authentication.getPrincipal().toString()).get();
//
//      if(passwordEncoder.matches(authentication.getCredentials().toString(),user.getPassword())){
//        return authentication;
//      }
//    }
//    catch (Exception e)
//    {
//      throw new BadCredentialsException("User not registreded");
//    }
//
//    throw new BadCredentialsException("Invalid Password");
//  }
//}
