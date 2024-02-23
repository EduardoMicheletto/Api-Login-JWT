package com.api.apicontroleuso.dto;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequest {

    private String login;
    private String senha;

}
