package com.accenture.accenture.domain.produtos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoRequestLoja {

    @NotBlank
    private String nome;
    @NotNull
    private Double preco;
    @NotNull
    private int quantidade;
    @NotBlank
    private String descricao;
}
