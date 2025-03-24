package com.springboot.springboot_login.services;

import com.springboot.springboot_login.entities.User;
import com.springboot.springboot_login.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    @Override
    public boolean registerUser(User user) {
        try {
            registerRepository.save(user);  // ➜ Database me user save karega
            return true;  // ➜ Agar successful hai to true return karega
        } catch (Exception e) {
            e.printStackTrace();  // ➜ Agar error aaya to error print karega
            return false;  // ➜ Registration fail hone par false return karega
        }
    }


    @Override
    public User loginUser(String email, String password) {
        User user = registerRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user; // Login successful
        }
        return null; // Login failed
    }
}
