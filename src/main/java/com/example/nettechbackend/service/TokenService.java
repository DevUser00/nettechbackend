//package com.example.nettechbackend.service;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//
//@Service
//public class TokenService {
//
//
//  @Value("${forum.jwt.expiration}")
//  private String expiration;
//
//  @Value("${forum.jwt.secret}")
//  private String secret;
//
//  public String createTokenJwt(String emailUser)
//  {
//    Date today = new Date();
//    Date dateExpiration = new Date(today.getTime() + Long.parseLong(expiration));
//
//    return Jwts.builder()
//      .setIssuer("API NETTECH")
//      .setSubject(emailUser)
//      .setIssuedAt(today)
//      .setExpiration(dateExpiration)
//      .signWith(SignatureAlgorithm.HS256,secret)
//      .compact();
//  }
//
//  public boolean isTokenValid(String token)
//  {
//    try
//    {
//      Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
//      return true;
//    }
//    catch (Exception e)
//    {
//      System.out.println(e);
//      return false;
//    }
//  }
//
//  public String getEmailUser(String token)
//  {
//    Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//
//    return claims.getSubject();
//  }
//}
