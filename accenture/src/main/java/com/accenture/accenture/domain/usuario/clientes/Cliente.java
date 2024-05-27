package com.accenture.accenture.domain.usuario.clientes;

import com.accenture.accenture.domain.usuario.clientes.dto.ClienteRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import com.accenture.accenture.domain.produtos.Produto;

import java.util.List;

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

    @OneToMany(mappedBy = "cliente")
    @JsonIgnore
    private List<Produto> produtos;

    public Cliente(ClienteRequest clienteToCreate) {
        this.nome = clienteToCreate.getNome();
        this.senha = clienteToCreate.getSenha();
        this.email = clienteToCreate.getEmail();
    }

}
