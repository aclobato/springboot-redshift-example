package com.example.redshift.controller;

import com.example.redshift.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/glorias")
    public List<String> getGlorias() {
        return userService.listGloriasCompleteNames();
    }

    @GetMapping("users/{firstName}")
    public List<String> getByFirstName(@PathVariable(value = "firstName") String firstName) {
        return userService.listByFirstName(firstName);
    }
}
