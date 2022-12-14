package com.example.nettechbackend.repository;

import com.example.nettechbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User ,Long> {


  User findByEmail(String userEmail);
}
