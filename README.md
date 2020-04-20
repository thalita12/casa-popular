# casa-popular 🏡
Projeto para realizar a distribuição de casas populares do governo.

### Índice
* [Pré-requisitos](#pré-requisitos "Pré-requisitos para a execução deste projeto")
* [Bibliotecas](#bibliotecas "Bibliotecas utilizadas")
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
    
- Database
    - H2

### Arquitetura do Back-end
Arquitetura de camadas utilizada neste projeto, trabalha em múltiplas camadas para dividir as responsabilidads e realizar um melhor gerenciamento e entendimento da organização e fluxo de atividade.

Há uma separação entre as diversas responsabilidades envolvidas no desempenho de cada função, de modo que o programa não é mais dividido entre um servidor e um cliente, mas em três ou mais camadas que se comunicam entre si quando têm necessidade.

Escolhi desenvolver o projeto em 3 camadas, que são:

- **Camada de Apresentação:** representada pelo navegador e pelo servidor web, organiza e exibe as informações para o usuário; recebe comandos e organiza a forma de entrada e saída;  
- **Camada de Lógica de Aplicação:** representada por um conjunto de objetos que contém a lógica de negócios do aplicativo; esses objetos ficam hosperdados num Servidor de Aplicativos. Pode ser reusada por várias formas de apresentação diferentes;  
- **Camada de Serviços de Dados:** representada pelo servidor de dados e pela abstração de dados, acesso a programas legados e sistema de arquivos. Somente pode ser acessada pela camada de lógica de aplicação, o que aumenta a segurança do sistema.  

A divisão de pacotes estão divididos a seguir:  
- **Business:** camada onde está o código que obtém os dados e os repassa de uma forma mais intuitiva, realizando a validação de lógica conforme as regras do negócio e verificando se os dados estão no formato adequado;  
- **Entity:** ;  
- **Repository:** ;  
- **Service:** .  
    
Para resolver o desafio técnico da distribuição de casas populares do governo, fiz uma lista de critérios e validei se as familias atendiam essa lista, utilizando o **"Design Pattern Delegation"**.

O **Design Pattern Delegate** é uma técnica em que um objeto expressa certo comportamento para o exterior, mas na realidade delega a responsabilidade de implementar esse comportamento em um objeto associado. Isso parece muito semelhante ao padrão de proxy, mas serve a um propósito muito diferente. A delegação é um mecanismo de abstração que centraliza o comportamento do objeto (método).

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
- Para a execução do **front-end**, basta visualizar o [arquivo de instalação](casa-popular-app/README.md).  

- Para a execução do **back-end**, basta visualizar o [arquivo de instalação](casa-popular-api/README.md).

### Licença
[MIT](LICENSE)

----

Desenvolvido por Thalita Oliveira.