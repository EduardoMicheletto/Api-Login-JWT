package com.api.apicontroleuso.controller;

import com.api.apicontroleuso.dto.LoginDto;
import com.api.apicontroleuso.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.header.Header;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    private String LoginEntity;
    @PostMapping(path = "/authentication")
    public String authentication(@RequestBody LoginDto login){
        loginService.logar(login);
        //gerar Token
        return null;
    }

}
