# Projeto Spring Boot 2.4.4 contendo CRUD de web services REST
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lilianmartinsfritzen/SpringBootCRUD/blob/main/LICENSE) 

# Sobre o projeto

Este projeto contém um CRUD completo de web services REST para acessar recursos de clientes e executar as cinco operações básicas listadas abaixo. A construção foi baseada no aprendizado obtido no Bootcamp [DevSuperior](https://devsuperior.com.br/ "Site da DevSuperior").

- Busca paginada de recursos
- Busca de recurso por Id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso

## Modelo conceitual
![Modelo Conceitual](https://user-images.githubusercontent.com/83084256/124994106-b7f5a500-e01b-11eb-8c0f-aeb6714ce517.png)


## Modelo em camadas
![Modelo em Camadas](https://user-images.githubusercontent.com/83084256/124994179-d6f43700-e01b-11eb-9711-2ca8373caed3.png)
<br>
Muito bem explicado pelo professor Nélio no vídeo abaixo.
<br>
[back end, front end, padrão camadas, mvc, rest](https://www.youtube.com/watch?v=b8uLFfzcVQ8 "YouTybe da DevSuperior").


## Observações sobre o desenvolvimento do projeto

- Implementação em camadas.
- Inclusão do banco de dados H2 e seed de dados.
- Utilização do open-in-view para assegurar que as transações sejam encerradas na camada de serviços, impedindo que a JPA ainda esteja aberta quando a operação retornar à camada de controladores.
- Manutenção da integridade das transações conforme propriedades ACID.
- Tratamento de exceções e inclusão dos códigos de status das respostas HTTP seguindo as respectivas requisições.
- Atualização de registro na JPA com o método que instancia um objeto provisório e somente acessa o banco de dados no momento de salvar, evitando acessos desnecessários.
- Deleção de registro com tratamento de exceção para impedir que ocorra inconsistência no banco de dados.
- Busca paginada com parâmetros opcionais.
- Utilização do <em>Instant</em> com padrão UTC a fim de registrar no H2 o momento da criação e atualização do registro.

# Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2 Database

# Como executar o projeto

Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/lilianmartinsfritzen/SpringBootCRUD
# entrar na pasta do projeto back end
cd backend
# executar o projeto
./mvnw spring-boot:run
```

# Autor

Lílian Martins Fritzen