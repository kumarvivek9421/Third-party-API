package com.CreateThirdPartyApi.controller;

import com.CreateThirdPartyApi.entities.User;
import com.CreateThirdPartyApi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/api")
    public ResponseEntity<User> getData(){
       return new ResponseEntity<>(userService.consumeApi(), HttpStatus.OK);
    }
}
