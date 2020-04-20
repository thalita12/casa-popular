# casa-popular 🏡
Projeto para realizar a distribuição de casas populares do governo.

### Índice
* [Motivações](#motivações "Minhas considerações")
* [Pré-requisitos](#pré-requisitos "Pré-requisitos para a execução deste projeto")
* [Bibliotecas](#bibliotecas "Bibliotecas utilizadas")
* [Arquitetura do Back-end](#arquitetura-do-back-end "Descrição da arquitetura do back-end")
* [Arquitetura do Front-end](#arquitetura-do-front-end "Descrição da arquitetura do front-end")
* [Instalação](#instalação "Instalação do projeto")
* [Resultado](#resultado "Resultado do projeto")
* [Licença](#licença "Licença do projeto")

### Motivações
Depois que li sobre o desafio, pensei em fazer algo parecido com uma solução completa, contendo front-end para as telas, banco de dados e back-end com as regras.  

Utilizei o Spring Boot para fazer o back-end, no front-end utilizei o Vue, e para o banco de dados utilizei o H2 para fazer algo simples e mais rápido.  

No meu back-end utilizei a arquitetura em camadas, algo que já tinho visto em outros projetos que trabalhei, e escolhi ele por ser algo que conheço e trabalho atualmente.  

Os pacotes ficaram divididos conforme o item de Arquitetura do Back-end. Queria dizer, que meu foco não é back-end, sou desenvolvedora front-end, e também atuo na área de testes e análise de requisitos. No back-end faço correções, além de desenvolver pequenos requisitos.

### Pŕe-requisitos
- Node.js [(download)](https://nodejs.org)
- Java 11 [(download)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Maven [(download)](https://maven.apache.org/download.cgi)

### Bibliotecas
- Front-end
    - Vue
    - Vuetify
    - Vuex
    - Axios
    
- Back-end
    - Maven
    - Java 11
    - Spring Boot
    - Lombok
    - Spring Boot Test
    
- Database
    - H2

### Arquitetura do Back-end
Arquitetura de camadas utilizada neste projeto, trabalha em múltiplas camadas para dividir as responsabilidades e realizar um melhor gerenciamento e entendimento da organização e fluxo de atividades.

Escolhi desenvolver o projeto em 3 camadas, que são:

- **Camada de Apresentação:** que são os serviços REST que representam a interface que acessam os recursos;  
- **Camada de Lógica de Aplicação:** onde contém a lógica de negócios da aplicação e regras de validação;  
- **Camada de Serviços de Dados:** provedor de dados da aplicação.  

A divisão de pacotes estão divididos a seguir:  
- **Business:** camada onde está o código que obtém os dados e realiza a validação de lógica, conforme as regras do negócio;  
- **Entity:** mapeamento das entidades do banco de dados;  
- **Repository:** realiza o serviço de buscar os dados no banco;  
- **Service:** camada onde contém os serviços REST.  

Para resolver os problemas da condição de pontuação e critérios de validação para saber se uma família é apta ou não, utilizando o **"Design Pattern Delegate"**.

O **Design Pattern Delegate** é uma técnica que um objeto expressa certo comportamento para outro, delegando responsabilidades de implementação esse comportamento em um objeto associado. A delegação é um mecanismo de abstração que centraliza o comportamento do objeto (método).

### Arquitetura do Front-end
Projeto desenvolvido utilizando o "Vue-cli" para criar a estrutura inicial do `casa-popular-app`.  

A estrutura de pastas estão dividas a seguir:
- **Assets:** logo do projeto;
- **Core:** onde se armazena as contantes utilizadas no projeto e o **store** do Vuex;
- **Plugins:** configuração da biblioteca Vuetify;
- **Views:** organização da camada de visualização para do cliente;   
      - **Components:** componentes unitlizados no projeto;  
      - **Mixins:** funções reutilizáveis;  
      - **Pages:** as páginas/telas de visualização do sistema;  
      - **Router:** as configurações de rotas do sistema;  
- **App.vue:** arquivo principal do Vue;  
- **main.js:** arquivo de configuração do Vue.

### Instalação
- Para a execução do **back-end**, basta visualizar o [arquivo de instalação](casa-popular-api/README.md).  

- Para a execução do **front-end**, basta visualizar o [arquivo de instalação](casa-popular-app/README.md).

### Resultado
Depois que subir o projeto, para verificar as requisições, basta conferir:
```
- Famílias aptas
http://localhost:8080/api/familias-aptas

- Famílias contempladas
http://localhost:8080/api/familias-contempladas
```

### Licença
[MIT](LICENSE)

----

Desenvolvido por Thalita Oliveira.