package com.accenture.accenture.domain.clientes.dto;

import com.accenture.accenture.domain.clientes.Cliente;
import com.accenture.accenture.domain.produtos.Produto;
import lombok.Data;

import java.util.List;

@Data
public class ClienteResponse {
    private Long id;
    private String nome;
    private String email;
    private List<Produto> produtos;

    public ClienteResponse(Cliente cliente) {
        this.id = cliente.getIdCliente();
        this.nome = cliente.getNome();
        this.email = cliente.getEmail();
        this.produtos = cliente.getProdutos();
    }
}
