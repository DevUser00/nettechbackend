//package com.example.nettechbackend.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import javax.persistence.*;
//import org.springframework.security.core.GrantedAuthority;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//public class RoleOLD implements GrantedAuthority {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private long id;
//
//
//  private String name;
//
//  @ManyToMany(mappedBy = "roles")
//  @JsonIgnore
//  private Set<UserOLD> users = new HashSet<>();
//
//  private long getRoleId(){
//    return this.id;
//  }
//
//  public void setName(String name) {
//    this.name = "ROLE_"+name.toUpperCase();
//  }
//
//  public Set<UserOLD> getUsers() {
//    return users;
//  }
//
//  public void setUsers(UserOLD user) {
//    users.add(user);
//  }
//
//  @Override
//  public String getAuthority() {
//    return name;
//  }
//
//
//}
