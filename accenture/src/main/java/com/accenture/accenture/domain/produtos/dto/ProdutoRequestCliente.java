package com.accenture.accenture.domain.produtos.dto;

import com.accenture.accenture.domain.clientes.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoRequestCliente {

    @NonNull
    private String nome;
    @NonNull
    private Double preco;
    @NonNull
    private int quantidade;
    @NonNull
    private String descricao;
    @NonNull
    private Long clienteId;

}
