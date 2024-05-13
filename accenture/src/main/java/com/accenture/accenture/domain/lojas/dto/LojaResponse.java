package com.accenture.accenture.domain.lojas.dto;

import com.accenture.accenture.domain.lojas.Loja;
import com.accenture.accenture.domain.produtos.Produto;
import lombok.Data;

import java.util.List;

@Data
public class LojaResponse {

    private Long id;
    private String nome;
    private String endereco;
    private String especialidade;
    private String cnpj;
    private List<Produto> produtos;

    public LojaResponse(Loja loja) {
        this.id = loja.getIdLoja();
        this.nome = loja.getNome();
        this.endereco = loja.getEndereco();
        this.especialidade = loja.getEspecialidade();
        this.cnpj = loja.getCnpj();
        this.produtos = loja.getProdutos();
    }
}
