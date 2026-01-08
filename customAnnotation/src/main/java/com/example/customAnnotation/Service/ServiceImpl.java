package com.example.customAnnotation.Service;

import com.example.customAnnotation.Annotation.Kholouud;
import com.example.customAnnotation.User.User;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {
  /*  ((reflectio))
    AOP --> proxyServiceimpl --> interceptor --> method(Serviceimpl) -->annotations  */

    /*@Kholouud(value = "Admin")
    void displayInputAdmin (String value) {

    }*/

    @Kholouud(value = "Admin")
    public User createUser (User user) {
        return  user;
    }

   /* @Kholouud(value = "User")
    void displayInputUser (String value) {
    }*/
}
  //input==> (user/admin XXXX)