package com.example.customAnnotation.Service;

import org.apache.catalina.User;

public interface Service {
    //display the entered value
   /*  void displayInputUser (String value);
    void displayInputAdmin (String value);*/
    User createUser (User user);

    }
