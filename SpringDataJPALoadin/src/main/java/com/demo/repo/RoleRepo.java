package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer>{

}
