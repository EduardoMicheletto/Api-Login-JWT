package com.api.apicontroleuso.service;

import com.api.apicontroleuso.config.JwtService;
import com.api.apicontroleuso.dto.AuthenticationResponse;
import com.api.apicontroleuso.dto.LoginRequest;
import com.api.apicontroleuso.dto.ResgistroRequest;
import com.api.apicontroleuso.entity.Usuario;
import com.api.apicontroleuso.entity.enums.Acessos;
import com.api.apicontroleuso.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse registro(ResgistroRequest registro) {
        if(usuarioRepository.findByLogin(registro.getLogin()).isPresent()){
            return AuthenticationResponse.builder().error("Nome de usuário já em uso.").build();
        }

        var usuario = Usuario.builder()
                .nome(registro.getNome())
                .login(registro.getLogin())
                .email(registro.getEmail())
                .password(passwordEncoder.encode(registro.getSenha()))
                .acessos(Acessos.USER)
                .build();

        usuarioRepository.save(usuario);

        return extrairAuthenticationResponse(usuario);
    }

    public AuthenticationResponse login(LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getLogin(),
                        request.getSenha()
                )
        );

        var usuario = usuarioRepository.findByLogin(request.getLogin())
                .orElseThrow();

        return extrairAuthenticationResponse(usuario);
    }

    private AuthenticationResponse extrairAuthenticationResponse(Usuario usuario) {
        var token = jwtService.generateToken(usuario);
        return AuthenticationResponse.builder()
                .token(token)
                .build();
    }

}
