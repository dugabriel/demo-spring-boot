package com.exempe.demo.api.v1.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.exempe.demo.api.v1.dtos.UserDTO;
import com.exempe.demo.api.v1.mapper.Mapper;
import com.exempe.demo.entities.User;
import com.exempe.demo.service.UserService;

@Controller
@RequestMapping(RestPathV1.PATH_V1 + "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<User> getAll() {
        return userService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    User createUser(@Valid @RequestBody UserDTO userDTO) {
        return userService.createUser(Mapper.map(userDTO, User.class));
    }
}
