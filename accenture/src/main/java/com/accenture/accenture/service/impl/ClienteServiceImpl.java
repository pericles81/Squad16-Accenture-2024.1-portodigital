package com.accenture.accenture.service.impl;

import com.accenture.accenture.domain.usuario.clientes.Cliente;
import com.accenture.accenture.domain.usuario.clientes.dto.ClienteRequest;
import com.accenture.accenture.domain.usuario.clientes.dto.ClienteResponse;
import com.accenture.accenture.repositories.ClienteRepository;
import com.accenture.accenture.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Optional<Cliente> login(String login, String senha) {
        var user = clienteRepository.findByEmailAndSenha(login, senha);
        return user;
    }

    @Override
    public List<ClienteResponse> getClientes() {
        return clienteRepository.findAll().stream().map(ClienteResponse::new).toList();
    }

    @Override
    public Optional<ClienteResponse> getClienteDetails(Long id) {
        var cliente = clienteRepository.getReferenceById(id);
        return Optional.of(new ClienteResponse(cliente));

    }

    @Override
    public void CreateCliente(ClienteRequest clienteToCreate) {
        var cliente = new Cliente(clienteToCreate);
        clienteRepository.save(cliente);
    }
}
