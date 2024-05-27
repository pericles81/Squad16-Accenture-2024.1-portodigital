package com.accenture.accenture.service;

import com.accenture.accenture.domain.usuario.clientes.Cliente;
import com.accenture.accenture.domain.usuario.clientes.dto.ClienteRequest;
import com.accenture.accenture.domain.usuario.clientes.dto.ClienteResponse;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    Optional<Cliente> login(String login, String senha);

    List<ClienteResponse> getClientes();
    Optional<ClienteResponse> getClienteDetails(Long id);
    void CreateCliente(ClienteRequest clienteToCreate);
}
