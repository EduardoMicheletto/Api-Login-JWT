package com.api.apicontroleuso.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @NoArgsConstructor
public class LoginDto {


    private String email;
    private String senha;
    //documento sempre sem formatacao;
    private String documento;

}
