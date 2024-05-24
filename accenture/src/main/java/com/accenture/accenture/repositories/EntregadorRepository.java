package com.accenture.accenture.repositories;

import com.accenture.accenture.domain.entregadores.Entregador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntregadorRepository extends JpaRepository<Entregador, Long> {

    Optional<Entregador> findByEmail(String email);
}
