package com.loja.estoque.controller;

import com.loja.estoque.entity.Roupa;
import com.loja.estoque.service.RoupaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roupas")
public class RoupaController { // Para expor endpoints RESTful.
    private final RoupaService roupaService;

    public RoupaController(RoupaService roupaService) {
        this.roupaService = roupaService;
    }

    @GetMapping
    public List<Roupa> listarRoupas() {
        return roupaService.listarRoupas();
    }

    @PostMapping
    public Roupa adicionarRoupa(@RequestBody Roupa roupa) {
        return roupaService.adicionarRoupa(roupa);
    }

    @DeleteMapping("/{id}")
    public void deletarRoupa(@PathVariable Long id) {
        roupaService.deletarRoupa(id);
    }

    @GetMapping("/buscar/nome")
    public List<Roupa> buscarPorNome(@RequestParam String nome) {
        return roupaService.buscarPorNome(nome);
    }

    @GetMapping("/buscar/codigo")
    public List<Roupa> buscarPorCodigoDeBarras(@RequestParam String codigo) {
        return roupaService.buscarPorCodigoDeBarras(codigo);
    }
}