## Gerenciamento de Loja - API de Produtos

**Descrição:**
Esta é uma API RESTful simples desenvolvida em Java utilizando Spring Boot para gerenciar informações de produtos em uma loja. A aplicação permite criar, ler, atualizar e deletar produtos através de requisições HTTP.

**Tecnologias Utilizadas:**
* **Java:** Linguagem de programação principal.
* **Spring Boot:** Framework para desenvolvimento de aplicações Java.
* **Spring Web:** Spring para desenvolvimento de aplicações web.
* **Spring Data JPA:** Acesso a dados utilizando JPA.
* **H2 Database:** Banco de dados em memória usado para auxiliar no desenvolvimento.
* **Lombok:** Biblioteca que ajuda a reduzir código.
* **Spring DevTools:** Ferramenta para melhorar a experiência de desenvolvimento.

**Estrutura do Projeto:**
* **`entities`:** Contém a entidade `Produto` com seus atributos.
* **`repositories`:** Contém o repositório `ProdutoRepository` para interagir com o banco de dados.
* **`services`:** Contém o serviço `ProdutoService` para a lógica de negócios.
* **`controllers`:** Contém o controlador `ProdutoController` para as operações HTTP.

**Como Executar:**
1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/venilsoncosta/gerenciamento-produto.git
