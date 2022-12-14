package com.example.nettechbackend.dto;


import com.example.nettechbackend.model.User;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {

  private Long id;
  private String username;
  private String email;


  private List<String> roles = new ArrayList<>();

  public UserDTO(Long id, String username, String email) {
    this.id = id;
    this.username = username;
    this.email = email;
  }

  public UserDTO(User entity) {
    id = entity.getId();
    username = entity.getUsername();
    email = entity.getEmail();
    for (GrantedAuthority role : entity.getAuthorities()) {
      roles.add(role.getAuthority());
    }
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }
}
