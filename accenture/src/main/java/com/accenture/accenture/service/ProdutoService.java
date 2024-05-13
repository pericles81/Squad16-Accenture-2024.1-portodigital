package com.accenture.accenture.service;

import com.accenture.accenture.domain.produtos.dto.ProdutoRequestCliente;
import com.accenture.accenture.domain.produtos.dto.ProdutoRequestLoja;
import com.accenture.accenture.domain.produtos.dto.ProdutoResponseCliente;
import com.accenture.accenture.domain.produtos.dto.ProdutoResponseLoja;

import java.util.List;

public interface ProdutoService {

    void createProdutoCliente(ProdutoRequestCliente requestCliente);
    void createProdutoLoja(ProdutoRequestLoja requestLoja);

    List<ProdutoResponseCliente> getProdutoPorCliente(Long clienteId);
    List<ProdutoResponseLoja> getProdutoPorLoja(Long lojaId);

    void deleteProdutoCliente(Long clienteId, Long produtoId);
    void deleteProdutoLoja(Long lojaId, Long produtoId);


}
