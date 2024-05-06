package com.accenture.accenture.domain.entregadores;

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
    private String veiculo;

    @Column(length = 10)
    private String placa;

    @Column(nullable = false)
    private String senha;
}
