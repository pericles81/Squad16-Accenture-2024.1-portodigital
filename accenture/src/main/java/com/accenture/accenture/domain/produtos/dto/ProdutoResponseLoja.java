package com.accenture.accenture.domain.produtos.dto;

import com.accenture.accenture.domain.usuario.lojas.Loja;
import com.accenture.accenture.domain.produtos.Produto;
import lombok.Data;

@Data
public class ProdutoResponseLoja {

    private Long idProduto;
    private String nome;
    private Double preco;
    private int quantidade;
    private String descricao;
    private Loja lojaId;

    public ProdutoResponseLoja(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
        this.quantidade = produto.getQuantidade();
        this.descricao = produto.getDescricao();
        this.lojaId = produto.getLoja();
    }
}
