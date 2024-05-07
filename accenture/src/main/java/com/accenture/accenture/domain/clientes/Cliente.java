package com.accenture.accenture.domain.clientes;

import com.accenture.accenture.domain.clientes.dto.ClienteRequest;
import jakarta.persistence.*;
import lombok.*;

import com.accenture.accenture.domain.produtos.Produto;

@Entity
@Table(name = "Cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idCliente")
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(nullable = false)
    private String senha;

    @Column(length = 100, nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public Cliente(ClienteRequest clienteToCreate) {
        this.nome = clienteToCreate.getNome();
        this.senha = clienteToCreate.getSenha();
        this.email = clienteToCreate.getEmail();
    }
}
