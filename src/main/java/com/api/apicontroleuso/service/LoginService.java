package com.api.apicontroleuso.service;

import com.api.apicontroleuso.dto.LoginDto;
import org.springframework.stereotype.Service;
@Service
public interface LoginService {

    String logar(LoginDto login);

}
