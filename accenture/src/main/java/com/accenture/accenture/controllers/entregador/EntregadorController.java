package com.accenture.accenture.controllers.entregador;

import com.accenture.accenture.domain.usuario.entregadores.dto.EntregadorRequest;
import com.accenture.accenture.domain.usuario.entregadores.dto.EntregadorResponse;
import com.accenture.accenture.service.EntregadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/entregador")
public class EntregadorController {

    @Autowired
    public EntregadorService entregadorService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<EntregadorResponse>> getEntregadorDetails(@PathVariable Long id){
        var entregador = entregadorService.getEntregador(id);
        if(entregador.isEmpty())
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        else
            return ResponseEntity.ok(entregador);
    }

    @PostMapping
    public ResponseEntity postEntregador(@RequestBody @Valid EntregadorRequest request){
        entregadorService.createEntregador(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
