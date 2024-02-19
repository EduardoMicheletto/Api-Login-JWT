package com.api.apicontroleuso.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class LoginEntity {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.PROTECTED)
    private Long id;
    private String email;
    private String senha;
    //documento sempre sem formatacao;
    private String documento;


    public void setDocumento(String documento) {
        documento = documento.replaceAll("[^a-zA-Z0-9]+", "");
        documento = documento.replaceAll(" ", "");
        this.documento = documento;

    }
}
