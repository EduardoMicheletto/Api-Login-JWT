package com.api.apicontroleuso.service.impl;

import com.api.apicontroleuso.dto.LoginRequest;

import com.api.apicontroleuso.service.UsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

//private LoginRepository loginRepository;

    @Override
    public String logar(LoginRequest login) {
//        LoginEntity loginEntity = loginRepository.findLoginEntityByEmailAndSenha(login.getEmail(), login.getSenha());


        return null;
    }

    @Override
    public boolean existUsuario(String login) {
        return false;
    }
}
