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


## Funcionalidades já implementadas

### Backend (Spring Boot)

- **Entidades:**
  - User (usuário)
  - Product (produto)
  - Favorite (favorito)
  - PriceHistory (histórico de preço)

- **Repositórios (JPA):**
  - UserRepository
  - ProductRepository
  - FavoriteRepository
  - PriceHistoryRepository

- **Services:**
  - UserService
  - ProductService
  - FavoriteService
  - PriceHistoryService

- **Controllers (API REST):**
  - UserController: cadastro e busca de usuário
  - ProductController: CRUD de produtos
  - FavoriteController: CRUD de favoritos por usuário
  - PriceHistoryController: histórico de preços por produto

- **Autenticação:**
  - Dependências para JWT adicionadas (spring-boot-starter-oauth2-resource-server e jjwt)
  - Classe utilitária JwtUtil criada para geração e validação de tokens JWT
  - Próximo passo: implementar AuthController para login e emissão de token

---


## Frontend (React)
O projeto possui um frontend desenvolvido em React, localizado na pasta `promocoes-frontend`.

### Estrutura do Frontend
- **src/pages/**: Páginas principais do sistema:
  - `Login.jsx`: Tela de login do usuário.
  - `Cadastro.jsx`: Tela de cadastro de novo usuário.
  - `ListaPromocoes.jsx`: Lista de promoções/produtos disponíveis.
  - `Favoritos.jsx`: Lista de produtos favoritos do usuário.
  - `DetalheProduto.jsx`: Detalhes de um produto selecionado.
- **src/components/**: Componentes reutilizáveis (ex: CardProduto, PrivateRoute).
- **src/services/**: Serviços de integração com a API (ex: `api.js`, `auth.js`).
- **src/hooks/**: Hooks customizados (ex: `useAuth.js` para autenticação).

### Funcionalidades do Frontend
- Login e cadastro de usuários (com integração à API backend)
- Listagem de promoções/produtos
- Visualização de detalhes do produto
- Marcação e visualização de favoritos
- Autenticação JWT (token salvo no localStorage)
- Rotas protegidas para páginas restritas

### Como Executar o Frontend
1. Certifique-se de ter o Node.js 18+ instalado.
2. No terminal, navegue até a pasta `promocoes-frontend` e execute:
  ```bash
  npm install
  npm start
  ```
3. Acesse a aplicação em `http://localhost:3000`

---

## Como Executar o Backend
1. Certifique-se de ter o Java 17+ instalado.
2. No terminal, navegue até a pasta do projeto e execute:
  ```bash
  ./mvnw spring-boot:run
  ```
  Ou, no Windows:
  ```cmd
  mvnw.cmd spring-boot:run
  ```
3. O backend estará disponível em `http://localhost:8080`

---

## Integração Backend <-> Frontend
- O frontend se comunica com o backend via API REST (`http://localhost:8080`).
- O token JWT é utilizado para autenticação nas rotas protegidas.
- Para testar a aplicação completa, execute ambos os projetos simultaneamente.

---

## Próximos Passos
- Implementar tela de histórico de preços no frontend
- Melhorar layout e responsividade
- Adicionar testes automatizados (frontend e backend)
- Implementar notificações de promoções

---

## Contribuição
Sinta-se à vontade para contribuir com o projeto! Sugestões, correções e melhorias são bem-vindas.

## Licença
Este projeto está sob a licença MIT.



