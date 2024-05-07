package com.accenture.accenture.domain.carrinhoProdutos;

import com.accenture.accenture.domain.pedidos.Pedido;
import jakarta.persistence.*;
import lombok.*;

import com.accenture.accenture.domain.produtos.Produto;

@Entity
@Table(name = "Carrinho")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Carrinho {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @Column(nullable = false)
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;
}
