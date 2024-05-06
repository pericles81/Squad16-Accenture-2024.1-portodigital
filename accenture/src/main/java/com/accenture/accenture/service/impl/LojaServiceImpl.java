package com.accenture.accenture.service.impl;

import com.accenture.accenture.domain.lojas.Loja;
import com.accenture.accenture.domain.lojas.dto.LojaRequest;
import com.accenture.accenture.domain.lojas.dto.LojaResponse;
import com.accenture.accenture.repositories.LojaRepository;
import com.accenture.accenture.service.LojaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LojaServiceImpl implements LojaService {

    private final LojaRepository lojaRepository;

    public LojaServiceImpl(LojaRepository lojaRepository) {
        this.lojaRepository = lojaRepository;
    }

    @Override
    public List<LojaResponse> getLojas() {
        return lojaRepository.findAll().stream().map(LojaResponse::new).toList();
    }

    @Override
    public void createLoja(LojaRequest request) {
        var loja = new Loja(request);
        lojaRepository.save(loja);
    }
}
