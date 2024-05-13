package com.accenture.accenture.service;

import com.accenture.accenture.domain.entregadores.dto.EntregadorRequest;
import com.accenture.accenture.domain.entregadores.dto.EntregadorResponse;

import java.util.Optional;

public interface EntregadorService {

    Optional<EntregadorResponse> getEntregador(Long idEntregador);
    void createEntregador(EntregadorRequest entregadorToCreate);
}
