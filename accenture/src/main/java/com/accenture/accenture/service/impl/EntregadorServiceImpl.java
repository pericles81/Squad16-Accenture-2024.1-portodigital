package com.accenture.accenture.service.impl;

import com.accenture.accenture.domain.usuario.entregadores.Entregador;
import com.accenture.accenture.domain.usuario.entregadores.dto.EntregadorRequest;
import com.accenture.accenture.domain.usuario.entregadores.dto.EntregadorResponse;
import com.accenture.accenture.repositories.EntregadorRepository;
import com.accenture.accenture.service.EntregadorService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntregadorServiceImpl implements EntregadorService {

    private final EntregadorRepository entregadorRepository;

    public EntregadorServiceImpl(EntregadorRepository entregadorRepository) {
        this.entregadorRepository = entregadorRepository;
    }

    @Override
    public Optional<Entregador> login(String login, String senha) {
        var user = entregadorRepository.findByEmailAndSenha(login, senha);
        return user;
    }

    @Override
    public Optional<EntregadorResponse> getEntregador(Long idEntregador) {
        var entregador = entregadorRepository.getReferenceById(idEntregador);
        return Optional.of(new EntregadorResponse(entregador));
    }

    @Override
    public void createEntregador(EntregadorRequest entregadorToCreate) {
        var entregador = new Entregador(entregadorToCreate);
        entregadorRepository.save(entregador);
    }
}
