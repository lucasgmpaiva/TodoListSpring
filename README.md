# TodoListSpring

## TodoList Implementado com Spring Boot

Este projeto trata-se da implementação de uma TodoList (Lista de Tarefas) por meio de Java Web, utilizando do framework Spring Boot, para a realização do desafio de recrutamento de estagiários da empresa ESIG -  Software e Consultoria em TI.

#### Autor: Lucas Gabriel Matias Paiva

### Tecnologias Utilizadas
Para a realização do projeto foram utilizadas as seguintes tecnologias:
- Java
- Spring Boot
- Spring MVC
- Spring JPA
- Thymeleaf
- Bootstrap 4
- MySQL

### Instruções de execução
Para a execução deste projeto é necessário, primeiro possuir os seguintes recursos em sua máquina:
- Java 1.8 (JDK)
- Eclipse IDE (com Maven)
- MySQL

#### Observação Importante
É necessário também que o banco de dados seja configurado na pasta: "application.properties". 
Neste caso é preciso criar o banco de dados no MySQL Server, mas apenas o banco, pois a aplicação está configurada para realizar a criação automática da tabela. Você pode fazer as alterações descritas a seguir após o passo 4 das instruções de execução.
As mudanças no arquivo de configuração devem ser as seguintes:
1. Alterar a propriedade "spring.datasource.url", para a url do banco que foi criado em seu MySQL Server.
2. Alterar as propriedades: "spring.datasource.username" e "spring.datasource.password" para o usuário e senha de seu servidor MySQL.

### Execução:
1. Baixe o projeto como .zip
2. Descompacte o arquivo
3. Na IDE Eclipse, siga o seguinte caminho: File -> Import... -> Existing Maven Projects -> Busque a pasta na qual você descompactou o arquivo -> Selecione o projeto e pressione "Finish".
4. Para garantir, realize a atualização do Maven: clique no botão direito no projeto, na aba "Maven" clique em "Update Project", selecione o projeto e confirme.
5. No pacote principal do projeto, "br.com.desafio.ToDoSpring", clique com o botão direito no arquivo "ToDoSpringApplication.java".
6. O programa já estará em execução. Para acessá-lo, em um navegador acesse: "localhost:8080"
