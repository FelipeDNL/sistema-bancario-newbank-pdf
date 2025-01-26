# Sistema bancario com extrato em PDF

Este projeto é um sistema bancário chamado **NewBank**. Ele é desenvolvido em Java e utiliza a biblioteca Swing para a interface gráfica assim como uma biblioteca para exportar o histórico do usuário em PDF. O projeto está estruturado em diferentes pacotes e classes que representam as funcionalidades e entidades do sistema bancário. A seguir, uma descrição detalhada dos principais componentes do projeto:

### Estrutura do Projeto

- **src/main/java/com/mycompany/entities**: Contém as classes que representam as entidades do sistema bancário, como contas e titulares.
  - **Conta**: Classe base para diferentes tipos de contas bancárias.
  - **ContaCorrente**: Representa uma conta corrente com limite de saque.
  - **ContaPoupanca**: Representa uma conta poupança com taxa de saque.
  - **ContaSalario**: Representa uma conta salário.
  - **Titular**: Representa o titular de uma conta bancária.
  - **Historico**: Gerencia o histórico de operações realizadas em uma conta.
  - **Operacao**: Representa uma operação bancária (sacar, depositar, pagar online).

- **src/main/java/com/mycompany/gui**: Contém as classes que implementam a interface gráfica do usuário.
  - **Janela**: Classe principal que gerencia a janela do aplicativo.
  - **Principal**: Tela inicial do aplicativo onde o usuário pode escolher o tipo de conta ou criar uma nova conta.
  - **TelaCorrente**: Tela para operações em uma conta corrente.
  - **TelaPoupanca**: Tela para operações em uma conta poupança.
  - **TelaSalario**: Tela para operações em uma conta salário.
  - **TelaCriarConta**: Tela para criação de novas contas.

### Funcionalidades

- **Criação de Contas**: O usuário pode criar diferentes tipos de contas (corrente, poupança, salário) fornecendo informações como nome e endereço do titular.
- **Operações Bancárias**: O usuário pode realizar operações como sacar, depositar e pagar online em diferentes tipos de contas.
- **Histórico de Operações**: O sistema mantém um histórico das operações realizadas em cada conta e permite a geração de um relatório em PDF.

### Exemplo de Uso

1. **Tela Principal**: O usuário inicia na tela principal onde pode escolher entre criar uma nova conta ou acessar uma conta existente.
2. **Criação de Conta**: Na tela de criação de conta, o usuário escolhe o tipo de conta e fornece as informações do titular.
3. **Operações Bancárias**: Após criar ou acessar uma conta, o usuário pode realizar operações como sacar, depositar e pagar online.
4. **Histórico**: O usuário pode visualizar o histórico de operações e gerar um relatório em PDF.

### Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Swing**: Biblioteca para criação da interface gráfica.
- **iText**: Biblioteca para geração de PDFs.

### Estrutura de Pastas

- **nbproject/**: Arquivos de configuração do projeto.
- **pom.xml**: Arquivo de configuração do Maven.
- **src/**: Código-fonte do projeto.
- **target/**: Arquivos compilados e gerados pelo Maven.

Este projeto oferece uma interface gráfica intuitiva para gerenciar contas bancárias e realizar operações financeiras, além de manter um histórico detalhado das transações.

<p align='center'>
  <img class='center' src='https://github.com/user-attachments/assets/a686cb43-706e-4752-8cad-96bd3a5fbb5e'>
</p>
