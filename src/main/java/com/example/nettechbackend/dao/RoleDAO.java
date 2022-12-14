package com.example.nettechbackend.dao;

import com.example.nettechbackend.model.Role;
import com.example.nettechbackend.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleDAO {

  private final RoleRepository roleRepository;

  public RoleDAO(RoleRepository roleRepository) {
    this.roleRepository = roleRepository;
  }

  public void saveRole(Role role){
    roleRepository.save(role);
  }
}
