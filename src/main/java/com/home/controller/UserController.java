package com.home.controller;


import com.home.entity.User;
import com.home.repos.UserRepo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
@Autowired
    UserRepo userRepo;

    @GetMapping
    @ApiOperation("Получение списка пользователей")
    public List<User> findUsers() {
        return userRepo.findAllByOrderByIdAsc();
    }


}
