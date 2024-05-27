package com.accenture.accenture.domain.produtos.dto;

import com.accenture.accenture.domain.usuario.clientes.Cliente;
import com.accenture.accenture.domain.produtos.Produto;
import lombok.Data;

@Data
public class ProdutoResponseCliente {

    private Long idProduto;
    private String nome;
    private Double preco;
    private int quantidade;
    private String descricao;
    private Cliente clienteId;

    public ProdutoResponseCliente(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
        this.quantidade = produto.getQuantidade();
        this.descricao = produto.getDescricao();
        this.clienteId = produto.getCliente();
    }
}
