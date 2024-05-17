package com.accenture.accenture.domain.produtos;

import com.accenture.accenture.domain.clientes.Cliente;
import com.accenture.accenture.domain.lojas.Loja;
import com.accenture.accenture.domain.produtos.dto.ProdutoRequestCliente;
import com.accenture.accenture.domain.produtos.dto.ProdutoRequestLoja;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @ManyToOne
    @JoinColumn(name = "id_loja")
    @JsonManagedReference
    private Loja loja;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    @JsonManagedReference
    private Cliente cliente;

    public Produto(ProdutoRequestLoja requestLoja) {
        this.nome = requestLoja.getNome();
        this.preco = requestLoja.getPreco();
        this.quantidade = requestLoja.getQuantidade();
        this.descricao = requestLoja.getDescricao();
    }

    public Produto(ProdutoRequestCliente requestCliente) {
        this.nome = requestCliente.getNome();
        this.preco = requestCliente.getPreco();
        this.quantidade = requestCliente.getQuantidade();
        this.descricao = requestCliente.getDescricao();
    }

}
