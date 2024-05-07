package com.accenture.accenture.service.impl;

import com.accenture.accenture.domain.clientes.Cliente;
import com.accenture.accenture.domain.clientes.dto.ClienteRequest;
import com.accenture.accenture.domain.clientes.dto.ClienteResponse;
import com.accenture.accenture.repositories.ClienteRepository;
import com.accenture.accenture.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<ClienteResponse> getClientes() {
        return clienteRepository.findAll().stream().map(ClienteResponse::new).toList();
    }

    @Override
    public void CreateCliente(ClienteRequest clienteToCreate) {
        var cliente = new Cliente(clienteToCreate);
        clienteRepository.save(cliente);
    }
}
