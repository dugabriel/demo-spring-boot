package com.exempe.demo.api.v1.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class UserDTO {

    @NotBlank(message = "login may not be blank")
    private String login;

    @NotBlank(message = "password may not be blank")
    private String password;

    @NotEmpty(message = "name may not be empty")
    private String name;
}
