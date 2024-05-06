package com.accenture.accenture.controllers.cliente;

import com.accenture.accenture.domain.clientes.dto.ClienteRequest;
import com.accenture.accenture.domain.clientes.dto.ClienteResponse;
import com.accenture.accenture.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping
    public ResponseEntity postCliente(@RequestBody @Validated ClienteRequest request){
        clienteService.CreateCliente(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
