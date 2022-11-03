package com.moz.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moz.demo.model.UserDao;
import com.moz.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<UserDao> get(){
        return userService.getForms();
    }

    @GetMapping("/id/{id}")
    public Optional<UserDao> pathVariable(@PathVariable("id") String id) {
        return userService.getFormWithId(id);
    }

    @PostMapping("/form")
    public UserDao post(@RequestBody UserDao user) {
        return userService.createForm(user);
    }

    @DeleteMapping("/id/{id}")
    public String delete(@PathVariable("id") String id) {
        return userService.deleteForm(id);
    }

    @PutMapping
    public String put() {
        return "Put";
    }

    
}
