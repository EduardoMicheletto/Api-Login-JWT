package com.api.apicontroleuso.service;

import com.api.apicontroleuso.dto.LoginRequest;
import org.springframework.stereotype.Service;
@Service
public interface UsuarioService {

    String logar(LoginRequest login);

    boolean existUsuario(String login);
}
