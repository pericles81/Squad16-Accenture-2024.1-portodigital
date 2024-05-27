package com.accenture.accenture.domain.usuario.lojas.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LojaRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String endereco;

    @NotBlank
    private String senha;

    @NotBlank
    private String especialidade;

    @NotBlank
    private String cnpj;

}

