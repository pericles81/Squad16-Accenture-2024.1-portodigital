package com.accenture.accenture.controllers.login;

import com.accenture.accenture.domain.usuario.dto.LoginRequest;
import com.accenture.accenture.service.ClienteService;
import com.accenture.accenture.service.EntregadorService;
import com.accenture.accenture.service.LojaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private EntregadorService entregadorService;

    @Autowired
    private LojaService lojaService;

    @GetMapping
    public String login() {
        return "login";
    }

    @PostMapping
    public Object login(@RequestBody @Valid LoginRequest loginRequest) {
        var cliente = clienteService.login(loginRequest.getLogin(), loginRequest.getSenha());
        var entregador = entregadorService.login(loginRequest.getLogin(), loginRequest.getSenha());
        var loja = lojaService.login(loginRequest.getLogin(), loginRequest.getSenha());

        if (cliente.isPresent()) {
            return cliente.get().getIdCliente();
        }if (entregador.isPresent()) {
            return entregador.get().getIdEntregador();
        }if (loja.isPresent()) {
            return loja.get().getIdLoja();
        }
        else
            return "Faça um login válido!";
    }

}
