package com.example.customAnnotation.Service;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface Service {
    //display the entered value
   /*  void displayInputUser (String value);
    void displayInputAdmin (String value);*/
    User createUser (User user);
    public void deleteUser(User user);

    }
