package com.accenture.accenture.service;

import com.accenture.accenture.domain.produtos.dto.ProdutoRequestCliente;
import com.accenture.accenture.domain.produtos.dto.ProdutoRequestLoja;
import com.accenture.accenture.domain.produtos.dto.ProdutoResponseCliente;
import com.accenture.accenture.domain.produtos.dto.ProdutoResponseLoja;

import java.util.List;

public interface ProdutoService {

    void createProdutoCliente(ProdutoRequestCliente requestCliente, Long id);
    void createProdutoLoja(ProdutoRequestLoja requestLoja, Long id);

    List<ProdutoResponseCliente> getProdutoPorCliente(Long clienteId);
    List<ProdutoResponseLoja> getProdutoPorLoja(Long lojaId);
    List<Object> getProdutos();

    void deleteProdutoCliente(Long clienteId, Long produtoId);
    void deleteProdutoLoja(Long lojaId, Long produtoId);


}
