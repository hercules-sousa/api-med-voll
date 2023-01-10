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

## Falando um pouco sobre o Spring Boot

### Criando projetos

Para a criação dos nosso projetos em Spring nós podemos utilizar o endereço:

[Spring Initializr](https://start.spring.io/)

Outra forma de criar uma aplicação em Spring Boot é usar o próprio Intellij para fazer isso.

#### Dependência recomendadas

- **Lombok**: para evitar a escrita de códigos boilerplate.
- **Spring Web**: para que possamos criar uma Web.
- **Spring Boot DevTools**.

## Recebendo as primeiras requisições e imprimindo uma mensagem na tela

Agora que nós já temos o projeto em Spring Boot rodando corretamente chegou o momento de mapear as requisições aos resultados que nós queremos que apareça na tela. Para realizar isso nós vamos precisar criar controllers. Para a criação de controllers é recomendado criar um pacote para armazená-los, esse pacote deve estar dentro do pacote principal, pois por padrão o Spring só escaneia pelos arquivos que estão dentro deste. Esse comportamento pode ser modificado ao se adicionar as anotações do tipo @ComponentScan.

### Código de um controller

```java
package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello World!";
    }
}
```

O exemplo de código acima possui algumas anotações:

- @RestController: serve para indicar que a classe abaixo é um controller de uma API do tipo REST.
- @RequestMapping: vai dizer qual é a url que esse controller vai mapear.
- @GetMapping: indica que o método abaixo vai responder a requisições do tipo get.

## Configurando o DevTools

O DevTools é uma ferramenta de desenvolvimento bastante útil, ela serve para que nós desenvolvedores não precisemos ficar reiniciando a aplicação manualmente toda vez que modificações são feitas e salvas na nossa aplicação.

Para configurar essa dependência você deve:

1. Abrir o menu de configurações e selecionar a opção `Build, Execution, Deployment`.
2. Selecionar a opção `Compiler` e marcar a caixa ao lado de `Build project automatically`.
3. Ainda no menu lateral, você deve abrir a opção de Advanced Settings e marcar o checkbox com o texto `Allow auto-make to start even if developed application is currently running`.