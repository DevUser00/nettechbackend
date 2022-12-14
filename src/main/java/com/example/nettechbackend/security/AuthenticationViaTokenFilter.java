//package com.example.nettechbackend.security;
//
//import com.example.nettechbackend.dao.UserDAO;
//import com.example.nettechbackend.model.UserOLD;
//import com.example.nettechbackend.service.TokenService;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//public class AuthenticationViaTokenFilter extends OncePerRequestFilter {
//
//  private TokenService tokenService;
//  private UserDAO userDAO;
//
//  public AuthenticationViaTokenFilter(TokenService tokenService, UserDAO userDAO) {
//    this.tokenService = tokenService;
//    this.userDAO = userDAO;
//  }
//
//  @Override
//  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//    String token = getTokenFromUser(request);
//
//    System.out.println(token);
//    boolean isTokenValid = tokenService.isTokenValid(token);
//
//    if(isTokenValid){
//      authenticateUser(token);
//    }
//
//    filterChain.doFilter(request,response);
//  }
//
//  private void authenticateUser(String token){
//    String username = tokenService.getEmailUser(token);
//    UserOLD user = userDAO.getUserByEmail(username).get();
//    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user,user.getPassword(), user.getAuthorities());
//    SecurityContextHolder.getContext().setAuthentication(authentication);
//  }
//
//  private String getTokenFromUser(HttpServletRequest request)
//  {
//    String token = request.getHeader("Authorization");
//
//    if(token == null || token.startsWith("Bearer ") ){
//      return null;
//    }
//    else
//    {
//      return token.replace("Bearer ", "");
//    }
//  }
//
//
//  @Override
//  protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
//
//    String loginPath = "/api/user/loginuser";
//    String registerPath = "/api/user/createuser";
//
//    if(request.getRequestURI().equalsIgnoreCase(loginPath) || request.getRequestURI().equalsIgnoreCase(registerPath)){
//      return true;
//    }
//
//    return false;
////    return super.shouldNotFilter(request);
//  }
//}
