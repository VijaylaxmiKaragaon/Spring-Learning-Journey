package com.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Entity.Profile;

@Repository
public interface ProfileRepo extends JpaRepository<Profile, Integer>{

}
