package com.accenture.accenture.controllers.cliente;

import com.accenture.accenture.domain.lojas.dto.LojaRequest;
import com.accenture.accenture.domain.lojas.dto.LojaResponse;
import com.accenture.accenture.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping
    public ResponseEntity postLoja(@RequestBody @Validated LojaRequest request){
        lojaService.createLoja(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
