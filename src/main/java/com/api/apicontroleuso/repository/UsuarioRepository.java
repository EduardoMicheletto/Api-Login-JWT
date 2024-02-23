package com.api.apicontroleuso.repository;

import com.api.apicontroleuso.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByLogin(String login) throws UsernameNotFoundException;
    Optional<Usuario> findByLoginAndPassword(String email, String senha) throws UsernameNotFoundException;

}
