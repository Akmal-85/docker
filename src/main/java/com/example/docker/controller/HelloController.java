package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salom")
public class HelloController {

    @GetMapping
    public String salom(){
        return "salom akmal";
    }
}
