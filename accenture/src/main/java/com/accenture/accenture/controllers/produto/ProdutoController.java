package com.accenture.accenture.controllers.produto;

import com.accenture.accenture.domain.produtos.dto.ProdutoRequestCliente;
import com.accenture.accenture.domain.produtos.dto.ProdutoRequestLoja;
import com.accenture.accenture.domain.produtos.dto.ProdutoResponseCliente;
import com.accenture.accenture.domain.produtos.dto.ProdutoResponseLoja;
import com.accenture.accenture.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/cliente")
    public ResponseEntity criarProdutoCliente(@RequestBody @Validated ProdutoRequestCliente requestCliente) {
        produtoService.createProdutoCliente(requestCliente);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/loja")
    public ResponseEntity criarProdutoLoja(@RequestBody @Validated ProdutoRequestLoja requestLoja) {
        produtoService.createProdutoLoja(requestLoja);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/cliente/{clienteId}")
    public ResponseEntity<List<ProdutoResponseCliente>> listarProdutosPorCliente(@PathVariable Long clienteId) {
        List<ProdutoResponseCliente> produtos = produtoService.getProdutoPorCliente(clienteId);
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/loja/{lojaId}")
    public ResponseEntity<List<ProdutoResponseLoja>> listarProdutosPorLoja(@PathVariable Long lojaId) {
        List<ProdutoResponseLoja> produtos = produtoService.getProdutoPorLoja(lojaId);
        return ResponseEntity.ok(produtos);
    }

    @DeleteMapping("/cliente/{clienteId}/{produtoId}")
    public ResponseEntity excluirProdutoCliente(@PathVariable Long clienteId, @PathVariable Long produtoId) {
        produtoService.deleteProdutoCliente(clienteId, produtoId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/loja/{lojaId}/{produtoId}")
    public ResponseEntity excluirProdutoLoja(@PathVariable Long lojaId, @PathVariable Long produtoId) {
        produtoService.deleteProdutoLoja(lojaId, produtoId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
