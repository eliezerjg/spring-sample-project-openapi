<h1>Projeto de Documentação Utilizando Spring Boot e Open API documentation Imple.</h1>
Esse é um projeto de exemplo que utiliza a biblioteca Spring Fox / Spring Doc para gerar documentação automática de APIs em uma aplicação Spring Boot.

<h2>Tecnologias Utilizadas</h2>
Java 20
Spring Boot
Spring Fox / Spring Doc (Swagger Documentation)
Maven
Instalação
Clone o repositório.
Execute o comando mvn clean install na raiz do projeto para baixar as dependências e compilar o código.
Execute o comando mvn spring-boot:run para iniciar a aplicação.
Utilização
Com a aplicação em execução, acesse a URL http://localhost:8080/swagger-ui.html para visualizar a documentação gerada pelo Spring Fox.

<h2>Configuração</h2>
A configuração do Spring Fox / Spring Doc é realizada através de anotações nos controladores da aplicação. É possível definir informações como o título da API, a descrição, a versão, os endpoints disponíveis, entre outros.
