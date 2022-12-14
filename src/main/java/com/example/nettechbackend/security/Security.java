//package com.example.nettechbackend.security;
//
//import com.example.nettechbackend.dao.UserDAO;
//import com.example.nettechbackend.service.TokenService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//@EnableWebSecurity
//@Configuration
//public class Security {
//
//  @Autowired
//  private TokenService tokenService;
//
//  @Autowired
//  private UserDAO userDAO;
//
//  @Bean
//  public PasswordEncoder bCryptPasswordEncoder(){
//    return new BCryptPasswordEncoder(10);
//  }
//
//
//  @Bean
//  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
//    httpSecurity
//    .csrf()
//    .disable()
//    .cors().disable()
//      .authorizeHttpRequests()
//    .requestMatchers("/api/user/createuser","/api/user/loginuser","/api/product/getallproducts","/api/user/getrolesfromuser","/api/product/getproductbyid","/api/product/getallpostfromproduct").permitAll()
//    .requestMatchers("/api/product/createproduct").hasRole("ADMIN")
//    .anyRequest()
//    .authenticated()
//    .and()
//    .sessionManagement()
//    .sessionCreationPolicy(SessionCreationPolicy.NEVER)
//    .and()
//    .addFilterBefore(new AuthenticationViaTokenFilter(tokenService,userDAO), UsernamePasswordAuthenticationFilter.class);
//
//
//    return httpSecurity.build();
//  }
//
//
//  @Bean
//  public AuthenticationManager authenticationManager(AuthenticationConfiguration auth) throws Exception{
//    return new CustomAuthenticationManager();
//  }
//
//  @Bean
//  public CorsConfigurationSource corsConfigurationSource() {
//    CorsConfiguration configuration = new CorsConfiguration();
//    configuration.setAllowedOrigins(Arrays.asList("/**"));
//    configuration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE"));
//    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//    source.registerCorsConfiguration("/**", configuration);
//    return source;
//  }
//}
