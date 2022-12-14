package com.example.nettechbackend.dao;

import com.example.nettechbackend.model.User;
import com.example.nettechbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDAO {

  private final UserRepository userRepository;

  public UserDAO(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User getUserById(long userId){
    return userRepository.findById(userId).get();
  }

//  public Optional<User> getUserByEmail(String userEmail){
//    return userRepository.findByEmail(userEmail);
//  }

  public void saveUser(User user){
    userRepository.save(user);
  }


}
