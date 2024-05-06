package com.accenture.accenture.domain.carrinhoProdutos;

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

    @Id
    @OneToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @Column(nullable = false)
    private Integer quantidade;
}
