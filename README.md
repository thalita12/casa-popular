# casa-popular 🏡
Projeto para realizar a distribuição de casas populares do governo.

### Índice
* [Pré-requisitos](#pré-requisitos "Pré-requisitos para a execução deste projeto")
* [Bibliotecas](#bibliotecas "Bibliotecas utilizadas")
* [Motivações]()
* [Arquitetura do Back-end](#arquitetura-do-back-end "Descrição da arquitetura do back-end")
* [Arquitetura do Front-end](#arquitetura-do-front-end "Descrição da arquitetura do front-end")
* [Instalação](#instalação "Instalação do projeto")
* [Licença](#licença "Licença do projeto")

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

### Motivações
Para resolver o desafio técnico da distribuição de casas populares do governo, fiz uma lista de critérios e validei se as familias atendiam essa lista, utilizando o **"Design Pattern Delegation"**.

O **Design Pattern Delegate** é uma técnica em que um objeto expressa certo comportamento para o exterior, mas na realidade delega a responsabilidade de implementar esse comportamento em um objeto associado. Isso parece muito semelhante ao padrão de proxy, mas serve a um propósito muito diferente. A delegação é um mecanismo de abstração que centraliza o comportamento do objeto (método).

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

### Licença
[MIT](LICENSE)

----

Desenvolvido por Thalita Oliveira.