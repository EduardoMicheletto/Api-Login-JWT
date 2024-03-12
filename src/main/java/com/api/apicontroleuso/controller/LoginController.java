package com.api.apicontroleuso.controller;

import com.api.apicontroleuso.dto.AuthenticationResponse;
import com.api.apicontroleuso.dto.LoginRequest;

import com.api.apicontroleuso.dto.ResgistroRequest;
import com.api.apicontroleuso.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/v1/login") @RequiredArgsConstructor
public class LoginController {

    private final AuthenticationService authenticationService;

    @PostMapping(path = "/registrar")
    public ResponseEntity<AuthenticationResponse> registro(
            @RequestBody ResgistroRequest registro) {
            return new ResponseEntity<>(authenticationService.registro(registro), HttpStatus.CREATED);
    }

    @PostMapping(path = "")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody LoginRequest login){
        return ResponseEntity.ok(authenticationService.login(login));
    }
}
