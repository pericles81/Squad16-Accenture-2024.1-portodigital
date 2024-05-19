package com.accenture.accenture.domain.produtos.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoRequestLoja {

    @NotBlank
    private String nome;
    @NotBlank
    private Double preco;
    @NotBlank
    private int quantidade;
    @NotBlank
    private String descricao;
    @NotBlank
    private Long lojaId;
}
