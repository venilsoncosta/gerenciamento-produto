package com.venilson.gerenciamento_loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venilson.gerenciamento_loja.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
