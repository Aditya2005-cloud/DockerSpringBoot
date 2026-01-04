package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Docker")
public class DockerController {
    @GetMapping
    public String hello(){
        return "Docker is running";
    }
}
