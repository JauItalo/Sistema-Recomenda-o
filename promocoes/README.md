# Sistema de Promoções

## Introdução
Este projeto é um sistema de recomendações de promoções, desenvolvido em Java utilizando o framework Spring Boot. O objetivo é permitir que usuários acompanhem produtos, visualizem o histórico de preços, marquem favoritos e recebam recomendações de promoções. O sistema é ideal para quem deseja monitorar variações de preços e aproveitar oportunidades de compra.

## Estrutura do Projeto
O projeto está organizado da seguinte forma:

- **src/main/java/com/seuprojeto/promocoes/**: Código-fonte principal da aplicação.
  - **PromocoesApplication.java**: Classe principal que inicializa a aplicação Spring Boot.
  - **model/**: Contém as entidades do sistema:
    - `Product.java`: Representa um produto monitorado.
    - `PriceHistory.java`: Armazena o histórico de preços dos produtos.
    - `User.java`: Representa um usuário do sistema.
    - `Favorite.java`: Relaciona usuários aos seus produtos favoritos.
  - **repository/**: Interfaces de acesso a dados (JPA Repositories):
    - `ProductRepository.java`: Operações com produtos.
    - `PriceHistoryRepository.java`: Operações com histórico de preços.
    - `UserRepository.java`: Operações com usuários.
    - `FavoriteRepository.java`: Operações com favoritos.

- **src/main/resources/**: Recursos da aplicação.
  - **application.properties**: Configurações do Spring Boot.
  - **static/**: Arquivos estáticos (imagens, CSS, JS).
  - **templates/**: Templates para views (caso utilize Thymeleaf ou similar).

- **src/test/java/com/meuprojeto/promocoes/**: Testes automatizados da aplicação.
  - `PromocoesApplicationTests.java`: Testes básicos de inicialização.

- **pom.xml**: Arquivo de configuração do Maven, com as dependências do projeto.
- **mvnw / mvnw.cmd**: Scripts para executar o Maven Wrapper.

## Como Executar
1. Certifique-se de ter o Java 17+ instalado.
2. No terminal, navegue até a pasta do projeto e execute:
   ```bash
   ./mvnw spring-boot:run
   ```
   Ou, no Windows:
   ```cmd
   mvnw.cmd spring-boot:run
   ```
3. Acesse a aplicação em `http://localhost:8080` (caso haja interface web implementada).



