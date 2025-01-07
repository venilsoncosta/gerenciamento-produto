package com.venilson.gerenciamento_loja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.venilson.gerenciamento_loja.entities.Produto;
import com.venilson.gerenciamento_loja.repositories.ProdutoRepository;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> listarProduto() {
        return produtoRepository.findAll();
    }

    public Produto atualizarProduto(Long id, Produto produto) {
        Produto produtoExistente = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        produtoExistente.setNome(produto.getNome());
        produtoExistente.setCategoria(produto.getCategoria());
        produtoExistente.setQuantidadeEstoque(produto.getQuantidadeEstoque());
        produtoExistente.setPreco(produto.getPreco());
        return produtoRepository.save(produtoExistente);
    }

    public void deletarProduto(Long id) {
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        produtoRepository.delete(produto);
    }

    public void buscarProdutoPorId(Long id) {
        produtoRepository.findById(id);
    }
}
