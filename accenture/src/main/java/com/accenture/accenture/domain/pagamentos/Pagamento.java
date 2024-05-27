package com.accenture.accenture.domain.pagamentos;

import jakarta.persistence.*;
import lombok.*;

import com.accenture.accenture.domain.usuario.clientes.Cliente;

@Entity
@Table(name = "Pagamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idPagamento")
public class Pagamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(nullable = false)
    private String tipoPagamento;
}
