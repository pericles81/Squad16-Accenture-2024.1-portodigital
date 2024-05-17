package com.accenture.accenture.repositories;

import com.accenture.accenture.domain.produtos.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query(value = "SELECT * FROM produto WHERE id_Cliente = :clienteId", nativeQuery = true)
    List<Produto> findProdutosByClienteId(Long clienteId);

    @Query(value = "SELECT * FROM produto WHERE id_Loja = :lojaId", nativeQuery = true)
    List<Produto> findProdutosByLojaId(Long lojaId);


}
