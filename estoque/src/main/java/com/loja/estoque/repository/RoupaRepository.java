package com.loja.estoque.repository;

import com.loja.estoque.entity.Roupa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoupaRepository extends JpaRepository<Roupa, Long> {
    List<Roupa> findByNomeContaining(String nome);
    List<Roupa> findByCodigoDeBarras(String codigoDeBarras);
}
