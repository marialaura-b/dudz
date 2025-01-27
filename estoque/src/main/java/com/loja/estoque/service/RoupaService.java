package com.loja.estoque.service;

import com.loja.estoque.entity.Roupa;
import com.loja.estoque.repository.RoupaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoupaService { //Lógica de negócios
    private final RoupaRepository roupaRepository;

    public RoupaService(RoupaRepository roupaRepository) {
        this.roupaRepository = roupaRepository;
    }

    public List<Roupa> listarRoupas() {
        return roupaRepository.findAll();
    }

    public Roupa adicionarRoupa(Roupa roupa) {
        return roupaRepository.save(roupa);
    }

    public void deletarRoupa(Long id) {
        roupaRepository.deleteById(id);
    }

    public List<Roupa> buscarPorNome(String nome) {
        return roupaRepository.findByNomeContaining(nome);
    }

    public List<Roupa> buscarPorCodigoDeBarras(String codigoDeBarras) {
        return roupaRepository.findByCodigoDeBarras(codigoDeBarras);
    }
}