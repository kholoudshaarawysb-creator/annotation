package com.example.customAnnotation.httpInterceptor;

import com.example.customAnnotation.Annotation.Kholouud;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import java.lang.reflect.Method;


@Component
public class Hpinterceptor implements HandlerInterceptor {

    //This method runs before any endpoint -> true , false
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
// logic :check the annotation on the endPoint
// handler (obj) represents the endpoint

        if (handler instanceof HandlerMethod handlerMethod) { //checks if the endpoint exists
            Method method = handlerMethod.getMethod();

            if (method.isAnnotationPresent(Kholouud.class)) {// returns the response if the annotation exists, otherwise stops processing
                Kholouud kholouud = method.getAnnotation(Kholouud.class); //annotation
                String value = kholouud.value();
                System.out.println("AnntationValueIs" + value);
                return true;
            }
        }
        return false;

    }
}