package com.mvcproject.stickynotes.advice;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class globalcontroller {

    @ModelAttribute("urlpath")
    public String getpath(HttpServletRequest httpServletRequest){
        return httpServletRequest.getServletPath();
    }
}
