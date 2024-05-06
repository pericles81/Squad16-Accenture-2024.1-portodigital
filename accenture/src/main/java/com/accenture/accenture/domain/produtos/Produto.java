package com.accenture.accenture.domain.produtos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idProduto")
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double preco;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private String descricao;
}
