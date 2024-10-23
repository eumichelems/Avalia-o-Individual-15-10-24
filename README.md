# Avaliação de API - Michele Moreira

## Descrição

Esta avaliação foi realizada como parte da disciplina de API RESTful, sob a orientação da brilhante professora Jacqueline Oliveira. O objetivo foi desenvolver e avaliar uma API seguindo requisitos específicos, garantindo a robustez e a funcionalidade do projeto.

## Objetivo

Desenvolver uma API RESTful utilizando Spring e Java para gerenciar informações de um sistema de cadastro de currículos. A API deve permitir a manipulação de dados relacionados aos candidatos a vagas em processos seletivos.

## Índice

- [Descrição](#descrição)
- [Objetivo](#objetivo)
- [Requisitos](#requisitos)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Funcionalidades Implementadas](#funcionalidades-implementadas)
- [Checklist do Projeto](#checklist-do-projeto)
- [Organização do Código](#organização-do-código)
- [Contato](#contato)

## Requisitos

1. **Modelagem de Dados**:
   - Criar modelos para representar candidatos (entity), vagas (enum), escolaridade (enum) e status do currículo (enum), considerando os atributos relevantes para cada entidade:
     - **Candidato**:
       - nome
       - dataNascimento
       - cpf
       - escolaridade (tipos: MEDIO, FUNDAMENTAL, GRADUACAO, POS_GRADUACAO, ESPECIALIZACAO)
       - vagaDesejada (tipos: ANALISTA, QA, DEV, TECH_LEAD, SUPORTE, UX)
       - statusCurriculo (tipos: EM_ANALISE, REPROVADO, APROVADO)
   - Utilizar anotações do JPA para mapear as entidades para tabelas no banco de dados.

2. **DTOs (Data Transfer Objects)**:
   - Criar DTOs para representar os objetos que serão enviados e recebidos pela API. Os DTOs devem ser utilizados para evitar vazamento de informações e garantir uma separação clara entre a camada de apresentação e a camada de negócios.

3. **Repositories**:
   - Implementar interfaces Repository para cada entidade, fornecendo métodos para realizar operações básicas de CRUD (Create, Read, Update, Delete).
   - **PLUS**: Utilizar derived queries para realizar consultas no banco de dados por vaga desejada ou escolaridade do candidato.

4. **Services**:
   - Criar classes de serviço para implementar a lógica de negócios relacionada ao cadastro de currículos.
   - Implementar métodos nos serviços para realizar operações como adicionar um novo currículo, atualizar informações do status, etc.

5. **Controllers**:
   - Implementar controllers para receber requisições HTTP e chamar os métodos apropriados nos serviços.
   - Utilizar anotações do Spring como @RestController, @RequestMapping, @GetMapping, @PostMapping, etc.

## Tecnologias Utilizadas

- **Java com Spring Boot**: Para a criação de uma API robusta e eficiente.
- **Flyway**: Para o controle de versão do banco de dados.
- **JWT**: Para autenticação e controle de acesso seguro.
- **DTOs**: Para uma transferência de dados eficaz entre as camadas da aplicação.
- **Swagger**: Para documentação clara e acessível da API.
- **Trello**: Para gestão de tarefas e acompanhamento do progresso.

## Funcionalidades Implementadas

- **CRUD Completo**: Para todos os recursos da API (candidatos, vagas, escolaridade, status do currículo).
- **Validações Personalizadas**: Mensagens de erro personalizadas para exceções de item não encontrado e validações de cadastro.
- **Autenticação e Controle de Acesso**: Implementado com JWT e Spring Security.

## ✅ Checklist do Projeto

- Implementação do CRUD para todos os recursos
- Validações personalizadas e tratamento de exceções
- Implementação de segurança com JWT

## 🛠️ Organização do Código

- `/src/main/java`: Contém o código-fonte da API
- `/src/main/resources`: Contém os recursos de configuração e scripts de banco de dados
- `/docs`: Documentação adicional do projeto

## Contato

Em caso de dúvidas ou sugestões, entre em contato comigo:

- **Michele Moreira**: [LinkedIn](https://www.linkedin.com/in/michelemoreira/)

---

Espero que esse README reflita todo o seu trabalho e dedicação na avaliação! Se precisar de mais alguma coisa, estou aqui! 🌟🚀
