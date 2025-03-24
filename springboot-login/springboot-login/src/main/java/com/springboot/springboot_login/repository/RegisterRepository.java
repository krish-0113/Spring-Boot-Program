package com.springboot.springboot_login.repository;

import com.springboot.springboot_login.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
