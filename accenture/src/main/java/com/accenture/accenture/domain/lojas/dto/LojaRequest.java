package com.accenture.accenture.domain.lojas.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class LojaRequest {

    @NonNull
    private String nome;

    @NonNull
    private String endereco;

    @NonNull
    private String senha;

    @NonNull
    private String especialidade;

    @NonNull
    private String cnpj;

}

