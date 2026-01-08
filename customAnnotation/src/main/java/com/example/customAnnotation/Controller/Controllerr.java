package com.example.customAnnotation.Controller;

import com.example.customAnnotation.Annotation.Kholouud;
import com.example.customAnnotation.User.User;

import com.example.customAnnotation.Service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerr {

    @Autowired
    private ServiceImpl serviceimpl;

    @Kholouud(value = "admin")
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        serviceimpl.createUser(user);
        return ResponseEntity.ok(user);
    }
}
