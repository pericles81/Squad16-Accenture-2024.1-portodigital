package com.accenture.accenture.service;


import com.accenture.accenture.domain.lojas.dto.LojaRequest;
import com.accenture.accenture.domain.lojas.dto.LojaResponse;

import java.util.List;

public interface LojaService {

    List<LojaResponse> getLojas();
    void createLoja(LojaRequest request);
}
