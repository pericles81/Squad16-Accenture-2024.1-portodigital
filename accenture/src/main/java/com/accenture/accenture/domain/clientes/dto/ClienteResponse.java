package com.accenture.accenture.domain.clientes.dto;

import com.accenture.accenture.domain.clientes.Cliente;
import lombok.Data;

@Data
public class ClienteResponse {
    private Long id;
    private String nome;
    private String email;

    public ClienteResponse(Cliente cliente) {
        this.id = cliente.getIdCliente();
        this.nome = cliente.getNome();
        this.email = cliente.getEmail();
    }
}
