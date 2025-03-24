package com.springboot.springboot_login.services;

import com.springboot.springboot_login.entities.User;

public interface RegisterService {
    boolean registerUser(User user);
    User loginUser(String email, String password);
}
