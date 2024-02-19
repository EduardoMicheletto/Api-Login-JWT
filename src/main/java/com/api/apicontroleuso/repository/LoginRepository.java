package com.api.apicontroleuso.repository;

import com.api.apicontroleuso.entity.LoginEntity;
import org.springframework.data.repository.Repository;

public interface LoginRepository extends Repository<LoginEntity, Long> {

    public LoginEntity findLoginEntityByEmailAndSenha(String email, String Senha);

}
