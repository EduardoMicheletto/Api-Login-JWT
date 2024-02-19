package com.api.apicontroleuso.service.impl;

import com.api.apicontroleuso.dto.LoginDto;
import com.api.apicontroleuso.entity.LoginEntity;
import com.api.apicontroleuso.repository.LoginRepository;
import com.api.apicontroleuso.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

private LoginRepository loginRepository;

    @Override
    public String logar(LoginDto login) {
        LoginEntity loginEntity = loginRepository.findLoginEntityByEmailAndSenha(login.getEmail(), login.getSenha());


        return null;
    }
}
