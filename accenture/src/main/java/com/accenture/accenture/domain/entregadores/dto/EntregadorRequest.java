package com.accenture.accenture.domain.entregadores.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorRequest {

    @NonNull
    private String nome;

    @NonNull
    private String veiculo;

    @NonNull
    private String senha;

    @NonNull
    private String placa;
}
