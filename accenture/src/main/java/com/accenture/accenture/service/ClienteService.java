package com.accenture.accenture.service;

import com.accenture.accenture.domain.clientes.dto.ClienteRequest;
import com.accenture.accenture.domain.clientes.dto.ClienteResponse;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    List<ClienteResponse> getClientes();
    Optional<ClienteResponse> getClienteDetails(Long id);
    void CreateCliente(ClienteRequest clienteToCreate);
}
