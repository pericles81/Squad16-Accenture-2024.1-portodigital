package com.accenture.accenture.service.impl;

import com.accenture.accenture.domain.clientes.Cliente;
import com.accenture.accenture.domain.produtos.Produto;
import com.accenture.accenture.domain.produtos.dto.ProdutoRequestCliente;
import com.accenture.accenture.domain.produtos.dto.ProdutoRequestLoja;
import com.accenture.accenture.domain.produtos.dto.ProdutoResponseCliente;
import com.accenture.accenture.domain.produtos.dto.ProdutoResponseLoja;
import com.accenture.accenture.repositories.ClienteRepository;
import com.accenture.accenture.repositories.LojaRepository;
import com.accenture.accenture.repositories.ProdutoRepository;
import com.accenture.accenture.service.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ClienteRepository clienteRepository;

    private final LojaRepository lojaRepository;

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ClienteRepository clienteRepository, LojaRepository lojaRepository, ProdutoRepository produtoRepository) {
        this.clienteRepository = clienteRepository;
        this.lojaRepository = lojaRepository;
        this.produtoRepository = produtoRepository;
    }

    @Override
    public void createProdutoCliente(ProdutoRequestCliente requestCliente) {
        var produto = new Produto(requestCliente);
        var clienteId = requestCliente.getClienteId();

        var cliente = clienteRepository.getReferenceById(clienteId);

        produto.setCliente(cliente);
        cliente.getProdutos().add(produto);
        produtoRepository.save(produto);
    }

    @Override
    public void createProdutoLoja(ProdutoRequestLoja requestLoja) {
        var produto = new Produto(requestLoja);
        var lojaId = requestLoja.getLojaId();
        var loja = lojaRepository.getReferenceById(lojaId);

        produto.setLoja(loja);
        loja.getProdutos().add(produto);
        produtoRepository.save(produto);
    }


    @Override
    public List<ProdutoResponseCliente> getProdutoPorCliente(Long clienteId) {
        return produtoRepository.findProdutosByClienteId(clienteId).stream().map(ProdutoResponseCliente::new).toList();
    }

    @Override
    public List<ProdutoResponseLoja> getProdutoPorLoja(Long lojaId) {
        return produtoRepository.findProdutosByLojaId(lojaId).stream().map(ProdutoResponseLoja::new).toList();
    }

    @Override
    public void deleteProdutoCliente(Long clienteId, Long produtoId) {
        var produto = produtoRepository.getReferenceById(produtoId);

        if (produto.getCliente().getIdCliente().equals(clienteId)) {
            produtoRepository.delete(produto);
        }
    }

    @Override
    public void deleteProdutoLoja(Long lojaId, Long produtoId) {
        var produto = produtoRepository.getReferenceById(produtoId);

        if (produto.getLoja().getIdLoja().equals(lojaId)) {
            produtoRepository.delete(produto);
        }
    }

}
