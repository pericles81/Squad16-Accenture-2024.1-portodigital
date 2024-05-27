package com.accenture.accenture.service;


import com.accenture.accenture.domain.usuario.lojas.Loja;
import com.accenture.accenture.domain.usuario.lojas.dto.LojaRequest;
import com.accenture.accenture.domain.usuario.lojas.dto.LojaResponse;

import java.util.List;
import java.util.Optional;

public interface LojaService {

    Optional<Loja> login(String login, String senha);


    List<LojaResponse> getLojas();
    Optional<LojaResponse> getLojaDetails(Long id);
    void createLoja(LojaRequest request);
}
