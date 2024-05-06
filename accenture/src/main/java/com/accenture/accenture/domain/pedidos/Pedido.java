package com.accenture.accenture.domain.pedidos;

import com.accenture.accenture.domain.carrinhoProdutos.Carrinho;
import jakarta.persistence.*;
import lombok.*;

import com.accenture.accenture.domain.clientes.Cliente;
import com.accenture.accenture.domain.entregas.Entrega;
import com.accenture.accenture.domain.pagamentos.Pagamento;
import com.accenture.accenture.domain.produtos.Produto;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Pedido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"idPedido", "cliente", "pagamento"})
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    private String statusPedido;

    private Date data;

    private Double valor;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "pagamento_id")
    private Pagamento pagamento;

    @ManyToOne
    @JoinColumn(name = "entrega_id")
    private Entrega entrega;

    @OneToMany(mappedBy = "pedido")
    private List<Carrinho> itens;
}
