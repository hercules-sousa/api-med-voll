# api-med-voll

## Sobre o curso e sobre o projeto sendo desenvolvido
O foco do curso é o aprendizado de como desenvolver uma API REST.

As tecnologias utilizadas serão:

- **Spring Boot** 3: a nova versão do Spring Boot disponibilizada no final do ano passado
- **Java 17**: a versão LTS mais recente dessa linguagem de programação
- **Lombok**: para evitar o uso de códigos boilerplate
- **MySQL / Flyway**: sendo o MySQL o no SGDB e o Flyway a nossa ferramenta de [schema migrations](https://www.cloudbees.com/blog/database-migration)
- **JPA / Hibernate**: para implementar a interação com o banco de dados.
- **Maven**: ferramenta de controle de dependências
- **Insomnia**: para testar a nossa API

# Falando um pouco sobre o Spring Boot

## Criando projetos

Para a criação dos nosso projetos em Spring nós podemos utilizar o endereço:

[Spring Initializr](https://start.spring.io/)

Outra forma de criar uma aplicação em Spring Boot é usar o próprio Intellij para fazer isso.

### Dependência recomendadas

- **Lombok**: para evitar a escrita de códigos boilerplate.
- **Spring Web**: para que possamos criar uma Web.
- **Spring Boot DevTools**.