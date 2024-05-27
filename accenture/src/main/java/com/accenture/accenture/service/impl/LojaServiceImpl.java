package com.accenture.accenture.service.impl;

import com.accenture.accenture.domain.usuario.lojas.Loja;
import com.accenture.accenture.domain.usuario.lojas.dto.LojaRequest;
import com.accenture.accenture.domain.usuario.lojas.dto.LojaResponse;
import com.accenture.accenture.repositories.LojaRepository;
import com.accenture.accenture.service.LojaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LojaServiceImpl implements LojaService {

    private final LojaRepository lojaRepository;

    public LojaServiceImpl(LojaRepository lojaRepository) {
        this.lojaRepository = lojaRepository;
    }

    @Override
    public Optional<Loja> login(String login, String senha) {
        var user = lojaRepository.findByCnpjAndSenha(login, senha);
        return user;
    }

    @Override
    public List<LojaResponse> getLojas() {
        return lojaRepository.findAll().stream().map(LojaResponse::new).toList();
    }

    @Override
    public Optional<LojaResponse> getLojaDetails(Long id) {
        var loja = lojaRepository.getReferenceById(id);
        return Optional.of(new LojaResponse(loja));
    }

    @Override
    public void createLoja(LojaRequest request) {
        var loja = new Loja(request);
        lojaRepository.save(loja);
    }
}
