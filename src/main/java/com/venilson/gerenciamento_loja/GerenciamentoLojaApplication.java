package com.venilson.gerenciamento_loja;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.venilson.gerenciamento_loja.entities.Produto;
import com.venilson.gerenciamento_loja.repositories.ProdutoRepository;

@SpringBootApplication
public class GerenciamentoLojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoLojaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ProdutoRepository produtoRepository) {
		return args -> {
			Produto produto1 = new Produto(null, "Camisa", "Vestuário", 10, 29.90);
      		Produto produto2 = new Produto(null, "Smartphone", "Eletrônicos", 5, 899.90);
      		Produto produto3 = new Produto(null, "Caderno", "Material Escolar", 20, 9.90);

			produtoRepository.save(produto1);
			produtoRepository.save(produto2);
			produtoRepository.save(produto3);
		};
	}

}
