# Aprendendo Spring

Este projeto tem como objetivo principal servir como ambiente de estudo para aprender a desenvolver aplicações Java com Spring Boot de forma prática e gradual.

## Descrição do projeto

O projeto foi criado para explorar os conceitos fundamentais do ecossistema Spring, incluindo configuração de projeto, estrutura MVC, criação de endpoints, uso do Maven e execução de uma aplicação web simples.

A proposta é simples: aprender por meio de prática, experimentação e desenvolvimento incremental. Por isso, ele funciona como uma base didática para quem está começando no mundo de Java e Spring.

## Para que serve

Este projeto serve como uma base para:

- aprender os princípios do Spring Boot;
- entender a estrutura de uma aplicação Java moderna;
- criar APIs e páginas web com Spring;
- praticar conceitos de desenvolvimento backend;
- evoluir gradualmente para projetos maiores e mais complexos.

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Maven
- HTML/CSS (quando necessário para interfaces simples)
- IntelliJ / VS Code como ambiente de desenvolvimento

## Requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- JDK 17 ou superior
- Maven
- Git
- IDE de sua preferência (VS Code, IntelliJ, Eclipse)

## Como executar o projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/aprendendo-spring.git
   ```

2. Acesse a pasta do projeto:

   ```bash
   cd aprendendo-spring
   ```

3. Execute a aplicação com Maven:

   ```bash
   ./mvnw spring-boot:run
   ```

   Ou, no Windows:

   ```bash
   mvnw.cmd spring-boot:run
   ```

4. A aplicação estará disponível em:

   ```bash
   http://localhost:8080
   ```

## Estrutura do projeto

```text
aprendendo-spring/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/igornalves/aprendendo_spring/
│   │   └── resources/
│   └── test/
├── pom.xml
├── mvnw
├── mvnw.cmd
├── HELP.md
└── README.md
```

## Observações

O nome do pacote foi ajustado para seguir o padrão correto da linguagem Java:

```text
com.igornalves.aprendendo_spring
```

Este é um projeto educacional e foi pensado para facilitar o aprendizado prático do framework Spring Boot.

## Materiais de apoio

- [Documentação oficial do Maven](https://maven.apache.org/guides/index.html)
- [Guia do Spring Boot Maven Plugin](https://docs.spring.io/spring-boot/4.1.1/maven-plugin)
- [Spring Web](https://docs.spring.io/spring-boot/4.1.1/reference/web/servlet.html)
- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

## Status

Projeto em desenvolvimento como material de estudo e aprendizado.

