package com.accenture.accenture.domain.entregas;

import jakarta.persistence.*;
import lombok.*;

import com.accenture.accenture.domain.entregadores.Entregador;

@Entity
@Table(name = "Entrega")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idEntrega")
public class Entrega {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntrega;

    @Column(nullable = false)
    private String formaPagamento;

    @Column(nullable = false)
    private String endereco;

    private String status;

    @ManyToOne
    @JoinColumn(name = "entregador_id")
    private Entregador entregador;
}
