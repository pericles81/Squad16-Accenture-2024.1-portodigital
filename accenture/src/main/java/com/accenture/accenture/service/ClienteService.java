package com.accenture.accenture.service;

import com.accenture.accenture.domain.clientes.dto.ClienteRequest;
import com.accenture.accenture.domain.clientes.dto.ClienteResponse;

import java.util.List;

public interface ClienteService {

    List<ClienteResponse> getClientes();
    void CreateCliente(ClienteRequest clienteToCreate);
}
