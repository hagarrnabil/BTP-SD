package com.example.btpsd.repositories.security;

import com.example.btpsd.model.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}