package com.accenture.accenture.domain.clientes.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String senha;

    @NotBlank
    private String email;

}
