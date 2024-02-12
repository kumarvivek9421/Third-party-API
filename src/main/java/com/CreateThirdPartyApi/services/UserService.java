package com.CreateThirdPartyApi.services;

import com.CreateThirdPartyApi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    private final RestTemplate restTemplate;
    @Autowired
    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User consumeApi(){
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", User.class);
    }
}
