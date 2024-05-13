package com.accenture.accenture.domain.produtos.dto;

import com.accenture.accenture.domain.lojas.Loja;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoRequestLoja {

    @NonNull
    private String nome;
    @NonNull
    private Double preco;
    @NonNull
    private int quantidade;
    @NonNull
    private String descricao;
    @NonNull
    private Long lojaId;
}
