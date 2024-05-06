package com.accenture.accenture.domain.lojas;

import com.accenture.accenture.domain.lojas.dto.LojaRequest;
import jakarta.persistence.*;
import lombok.*;

import com.accenture.accenture.domain.produtos.Produto;

import java.util.List;

@Entity
@Table(name = "Loja")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idLoja")
public class Loja {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLoja;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 100, nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String senha;

    @Column(length = 100, nullable = false)
    private String especialidade;

    @Column(length = 14, nullable = false, unique = true)
    private String cnpj;

    @OneToMany(mappedBy = "loja")
    private List<Produto> produtos;

    public Loja(LojaRequest request) {
        this.nome = request.getNome();
        this.endereco = request.getEndereco();
        this.senha = request.getSenha();
        this.especialidade = request.getEspecialidade();
        this.cnpj = request.getCnpj();
    }
}
