Recuperação da Tarefa 1 de Laboratório de Programação
Desenvolver a lógica por trás de um sistema bancário chamado NewBank, onde os
seguintes requisitos devem ser resolvidos:

Deve ser possível criar e utilizar contas bancárias, onde pode ser conta
salário (opção 1), conta corrente (opção 2) e poupança (opção 3). Todas as
contas possuem um objeto titular contendo nome e endereço. Toda conta
possui saldo e as operações de sacar (algum valor), depositar (algum valor) e
pagar online (algum valor). Desta forma, os setters de saldo não existem
(setSaldo deve ser removido pela inserção dos métodos de sacar e
depositar).

Somente a conta corrente permite ficar com saldo negativo em caso de
operações que ultrapassem o atual saldo. Lembrando que devem possuir
como propriedade um limite para operações com saldo negativo. Quando
ultrapassar o limite, deve bloquear a operação pretendida retornando falso
(fundos insuficientes);

Conta salário é a única que não permite pagamentos online;
Poupanças possuem uma taxa de saque de 0,05%;
Implemente uma classe Operação que possui descrição da operação, valor
operado, data com hora e a conta utilizada. Depois implemente uma classe
Historico onde deve conter um objeto titular e uma lista com operações. Na
classe Histórico deverá possuir um método de busca para retornar por uma
operação em específico e um outro método com pesquisa por valores (se
desejar, poderá implementar tudo em um método somente).

O sistema deverá emitir extrato em PDF das operações, conforme lógica do
item acima.
