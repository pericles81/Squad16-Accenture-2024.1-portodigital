package com.accenture.accenture.service;


import com.accenture.accenture.domain.lojas.dto.LojaRequest;
import com.accenture.accenture.domain.lojas.dto.LojaResponse;

import java.util.List;
import java.util.Optional;

public interface LojaService {

    List<LojaResponse> getLojas();
    Optional<LojaResponse> getLojaDetails(Long id);
    void createLoja(LojaRequest request);
}
