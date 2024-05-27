package com.accenture.accenture.repositories;

import com.accenture.accenture.domain.usuario.lojas.Loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Long> {

    Optional<Loja> findByCnpjAndSenha(String login, String senha);
}
