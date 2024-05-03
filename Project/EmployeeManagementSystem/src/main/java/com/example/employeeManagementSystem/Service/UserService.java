package com.example.employeeManagementSystem.Service;

import com.example.employeeManagementSystem.Dto.UserRegistrationDto;
import com.example.employeeManagementSystem.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
