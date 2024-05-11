package com.accenture.accenture.domain.entregadores.dto;


import com.accenture.accenture.domain.entregadores.Entregador;
import lombok.Data;

@Data
public class EntregadorResponse {

    private String nome;
    private String veiculo;
    private String placa;

    public EntregadorResponse(Entregador entregador) {
        this.nome = entregador.getNome();
        this.veiculo = entregador.getVeiculo();
        this.placa = entregador.getPlaca();
    }
}
