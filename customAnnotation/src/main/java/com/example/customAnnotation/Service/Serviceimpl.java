package com.example.customAnnotation.Service;

import com.example.customAnnotation.Annotation.Kholouud;

public class Serviceimpl {
  /*  ((reflectio))
    AOP --> proxyServiceimpl --> interceptor --> method(Serviceimpl) -->annotations  */

    @Kholouud(value = "Admin")
    void displayInputAdmin (String value) {
    }

    @Kholouud(value = "User")
    void displayInputUser (String value) {
    }
}
  //input==> (user/admin XXXX)