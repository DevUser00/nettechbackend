//package com.example.nettechbackend.model;
//
//import org.springframework.security.core.GrantedAuthority;
//
//import javax.persistence.*;
//import java.util.*;
//
//@Entity
//public class UserOLD {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private long id;
//
//  private String username;
//  @Column(unique = true)
//  private String email;
//  private String password;
//
//  private String token;
//  @ManyToMany
//  @JoinTable(
//          name = "user_product",
//          joinColumns = @JoinColumn(name = "userId"),
//          inverseJoinColumns = @JoinColumn(name = "productId")
//  )
//  private Set<Product> favoriteProducts = new HashSet<>();
//
//  @OneToMany
//  private List<Post> posts = new ArrayList<>();
//
//  @ManyToMany(fetch = FetchType.EAGER)
//  @JoinTable(
//          name = "user_role",
//          joinColumns = @JoinColumn(name = "user_id"),
//          inverseJoinColumns = @JoinColumn(name = "role_id")
//  )
//  private Set<RoleOLD> roles = new HashSet<>();
//
//  @Override
//  public Collection<? extends GrantedAuthority> getAuthorities() {
//    return roles;
//  }
//
//
//  public void setRoles(RoleOLD newRole) {
//    roles.add(newRole);
//  }
//
//  @Override
//  public boolean isAccountNonExpired() {
//    return false;
//  }
//
//  @Override
//  public boolean isAccountNonLocked() {
//    return false;
//  }
//
//  @Override
//  public boolean isCredentialsNonExpired() {
//    return false;
//  }
//
//  @Override
//  public boolean isEnabled() {
//    return false;
//  }
//
//  public void setUsername(String username) {
//    this.username = username;
//  }
//
//  public String getEmail() {
//    return email;
//  }
//
//  public void setEmail(String email) {
//    this.email = email;
//  }
//
//  public String getPassword() {
//    return password;
//  }
//
//  public void setPassword(String password) {
//    this.password = password;
//  }
//
//  public Set<Product> getFavoriteProducts() {
//    return favoriteProducts;
//  }
//
//  public void setFavoriteProducts(Product newFavoriteProduct) {
//    favoriteProducts.add(newFavoriteProduct);
//  }
//
//  public List<Post> getPosts() {
//    return posts;
//  }
//
//  public void setPosts(Post newPost) {
//    posts.add(newPost);
//  }
//
//  public String getToken() {
//    return token;
//  }
//
//  public void setToken(String token) {
//    this.token = token;
//  }
//
//  public long getId() {
//    return id;
//  }
//
//  public void setId(long id) {
//    this.id = id;
//  }
//
//  @Override
//  public String getUsername() {
//    return username;
//  }
//}
