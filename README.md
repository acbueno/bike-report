# Bike Report

O Bike Report é um projeto Spring Boot que serve como exemplo de como desenvolver uma aplicação utilizando Clean Architecture. A Clean Architecture, proposta por Robert C. Martin, visa separar as responsabilidades da aplicação em camadas bem definidas, facilitando a manutenção e a evolução do sistema.

## Funcionalidades
- Cadastro de bicicletas
- Cadastro de peças
- Geração de relatórios de bicicletas e suas peças.

## Tecnologias Utilizadas
- Spring Boot: Framework para criação de aplicações Java.
- Spring Data JPA: Facilita o acesso e a persistência de dados em bancos de dados relacionais.
- FlywayDB: Uma ferramenta de controle de versão de banco de dados. Ele permite que você versione seus scripts SQL e os aplique automaticamente ao banco de dados conforme sua aplicação evolui, garantindo que todos os desenvolvedores e instâncias do banco de dados estejam sincronizados.
- Lombok: É uma biblioteca do Java que ajuda a reduzir a verbosidade do código, fornecendo anotações que geram automaticamente métodos padrão, como getters, setters, construtores e métodos equals() e hashCode(). Isso ajuda a tornar o código mais limpo e legível, eliminando a necessidade de escrever esses métodos manualmente.
- OpenAPI: Especificação para descrever APIs RESTful de forma padronizada e independente de linguagem. Anteriormente conhecida como Swagger, a OpenAPI Specification (OAS) define um formato de documento JSON ou YAML que descreve detalhadamente todas as operações disponíveis na API, incluindo os endpoints, parâmetros de entrada, formatos de saída, autenticação necessária e demais informações relevantes.

## Como Executar o Projeto
1. Clone o repositório: `git clone https://github.com/acbueno/bike-report.git`
2. Navegue até o diretório do projeto: `cd bike-report`
3. Execute a aplicação: `./mvnw spring-boot:run`
4. Acesse a aplicação no navegador: [http://localhost:8080](http://localhost:8080)
