package com.exempe.demo.api.v1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = RestPathV1.pathV1 + "/user")
public class UserController {

    @GetMapping(value = "/all")
    public @ResponseBody String getTest() {
        return "OK";
    }
}
