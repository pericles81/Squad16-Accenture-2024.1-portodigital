package com.accenture.accenture.repositories;

import com.accenture.accenture.domain.usuario.clientes.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByEmailAndSenha(String login, String senha);

}
