package com.axis.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.axis.lms.exception.ResourceNotFoundException;
import com.axis.lms.model.User;
import com.axis.lms.repository.UserRepository;
import com.axis.lms.security.CurrentUser;
import com.axis.lms.security.UserPrincipal;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
 
    @Autowired
    private RestTemplate restTemlate;
    
    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
