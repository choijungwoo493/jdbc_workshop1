package com.nhnacademy.edu.jdbc1.web;


import com.nhnacademy.edu.jdbc1.repository.JdbcUserRepository;
import com.nhnacademy.edu.jdbc1.service.login.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public String login(){
        UserRepository userRepository = new JdbcUserRepository();
        userRepository.
    }
}
