package com.accenture.accenture.controllers.loja;

import com.accenture.accenture.domain.lojas.dto.LojaRequest;
import com.accenture.accenture.domain.lojas.dto.LojaResponse;
import com.accenture.accenture.service.LojaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lojas")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @GetMapping
    public ResponseEntity<List<LojaResponse>> getLojas(){
        var lojas = lojaService.getLojas();
        if(lojas.isEmpty())
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.ok(lojas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<LojaResponse>> getLojaDetails(@PathVariable Long id){
        var loja = lojaService.getLojaDetails(id);
        if(loja.isEmpty())
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.ok(loja);
    }

    @PostMapping
    public ResponseEntity postLoja(@RequestBody @Valid LojaRequest request){
        lojaService.createLoja(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
