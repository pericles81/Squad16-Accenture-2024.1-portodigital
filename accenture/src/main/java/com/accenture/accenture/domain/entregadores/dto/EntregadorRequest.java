package com.accenture.accenture.domain.entregadores.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String veiculo;

    @NotBlank
    private String senha;

    @NotBlank
    private String placa;
}
