package com.accenture.accenture.domain.lojas.dto;

import com.accenture.accenture.domain.lojas.Loja;
import lombok.Data;

@Data
public class LojaResponse {

    private String nome;
    private String endereco;
    private String especialidade;
    private String cnpj;

    public LojaResponse(Loja loja) {
        this.nome = loja.getNome();
        this.endereco = loja.getEndereco();
        this.especialidade = loja.getEspecialidade();
        this.cnpj = loja.getCnpj();
    }
}
