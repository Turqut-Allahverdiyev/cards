package com.developia.cards.controller;

import com.developia.cards.dao.entity.UserEntity;
import com.developia.cards.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/rest/users")
@RestController

public class UserRestController {
    private final UserService service;
    public UserRestController(UserService userService){
        this.service = userService;

    }
    @GetMapping("/{id}")
    public UserEntity getUserRest(@PathVariable(name = "id") Long userId){
        return service.getUserByID(userId);
    }
}
