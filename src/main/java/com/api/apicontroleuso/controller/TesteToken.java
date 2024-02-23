package com.api.apicontroleuso.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/teste")
public class TesteToken {

    @GetMapping
    private ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World!");
    }

}
