package com.api.apicontroleuso.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResgistroRequest {
    private String nome;
    private String email;
    private String login;
    private String senha;
}
