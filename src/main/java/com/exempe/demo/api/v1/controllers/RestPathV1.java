package com.exempe.demo.api.v1.controllers;

public abstract class RestPathV1 {

    public static final String PATH_V1 = "/api/v1";

    private RestPathV1() throws IllegalAccessException {
        throw new IllegalAccessException("Utility Class!");
    }
}
