package com.accenture.accenture.controllers.cliente;

import com.accenture.accenture.domain.usuario.clientes.dto.ClienteRequest;
import com.accenture.accenture.domain.usuario.clientes.dto.ClienteResponse;
import com.accenture.accenture.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteResponse>> getClientes(){
        var clientes = clienteService.getClientes();
        if(clientes.isEmpty())
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.ok(clientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ClienteResponse>> getClientesDetails(@PathVariable Long id){
        var cliente = clienteService.getClienteDetails(id);
        if(cliente.isEmpty())
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.ok(cliente);
    }

    @PostMapping
    public ResponseEntity postCliente(@RequestBody @Valid ClienteRequest request){
        clienteService.CreateCliente(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
