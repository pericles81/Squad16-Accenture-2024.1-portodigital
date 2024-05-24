package com.accenture.accenture.domain.entregadores;

import com.accenture.accenture.domain.entregadores.dto.EntregadorRequest;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Entregador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idEntregador")
public class Entregador {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntregador;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 100, nullable = false)
    private String veiculo;

    @Column(length = 10)
    private String placa;

    @Column(nullable = false)
    private String senha;

    public Entregador(EntregadorRequest request) {
        this.nome = request.getNome();
        this.veiculo = request.getVeiculo();
        this.placa = request.getPlaca();
        this.senha = request.getSenha();
    }
}
