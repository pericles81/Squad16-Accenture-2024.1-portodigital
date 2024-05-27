package com.accenture.accenture.service;

import com.accenture.accenture.domain.usuario.entregadores.Entregador;
import com.accenture.accenture.domain.usuario.entregadores.dto.EntregadorRequest;
import com.accenture.accenture.domain.usuario.entregadores.dto.EntregadorResponse;

import java.util.Optional;

public interface EntregadorService {

    Optional<Entregador> login(String login, String senha);

    Optional<EntregadorResponse> getEntregador(Long idEntregador);
    void createEntregador(EntregadorRequest entregadorToCreate);
}
