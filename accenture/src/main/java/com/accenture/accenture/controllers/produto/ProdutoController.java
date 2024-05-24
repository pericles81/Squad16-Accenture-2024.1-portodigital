package com.accenture.accenture.controllers.produto;

import com.accenture.accenture.domain.produtos.dto.ProdutoRequestCliente;
import com.accenture.accenture.domain.produtos.dto.ProdutoRequestLoja;
import com.accenture.accenture.domain.produtos.dto.ProdutoResponseCliente;
import com.accenture.accenture.domain.produtos.dto.ProdutoResponseLoja;
import com.accenture.accenture.service.ClienteService;
import com.accenture.accenture.service.LojaService;
import com.accenture.accenture.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private LojaService lojaService;

    @PostMapping("/cliente/{clienteId}")
    public ResponseEntity criarProdutoCliente(@RequestBody @Valid ProdutoRequestCliente requestCliente, @PathVariable Long clienteId) {
        if(clienteService.getClienteDetails(clienteId).isPresent()){
            produtoService.createProdutoCliente(requestCliente, clienteId);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado!");
    }

    @PostMapping("/loja/{lojaId}")
    public ResponseEntity criarProdutoLoja(@RequestBody @Valid ProdutoRequestLoja requestLoja, @PathVariable Long lojaId) {
        var lojaOptional = lojaService.getLojaDetails(lojaId);
        if (lojaOptional.isPresent()) {
            produtoService.createProdutoLoja(requestLoja, lojaId);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Loja não encontrada!");
    }


    @GetMapping
    public ResponseEntity<List<Object>> listarProdutos(){
        var produtos = produtoService.getProdutos();
        if (produtos.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/cliente/{clienteId}")
    public ResponseEntity<List<ProdutoResponseCliente>> listarProdutosPorCliente(@PathVariable Long clienteId) {
        List<ProdutoResponseCliente> produtos = produtoService.getProdutoPorCliente(clienteId);
        if(produtos.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/loja/{lojaId}")
    public ResponseEntity<List<ProdutoResponseLoja>> listarProdutosPorLoja(@PathVariable Long lojaId) {
        List<ProdutoResponseLoja> produtos = produtoService.getProdutoPorLoja(lojaId);
        if(produtos.isEmpty())
            return ResponseEntity.noContent().build();
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
