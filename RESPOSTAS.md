1. No Ciclo 1 usamos return 70. Por que isso é aceitável no TDD? O que obrigou a escrever a soma de verdade?
   Sim, é aceitável devido ao fato de fazer parte da técnica "fake it" , ou seja, fingir até conseguir, no TDD, que tem o objetivo de fazer o teste passar da maneira mais simples possível no início. O que obrigou a escrever a soma, de verdade, foi a introdução de um segundo teste, com valores diferentes na triangulação, quebrando o retorno fixo, exigindo a implementação realizada.

2. No Ciclo 3, por que testar com 69 e 70, e não com 50 e 90?
   Porque ambos representam os valores de limites. Testar com estes valores específicos aplica a técnica de Análise do Valor Limite, com a garantia de que a condição lógica utilize o operador correto (`>= 70`).

3. No Ciclo 4, o que mudou na refatoração? Como você teve certeza de que não quebrou nada?
   Na refatoração, os blocos `if` repetidos de validação de notas foram extraídos para um método auxiliar privado chamado `validarNota`. A certeza de que, nada foi quebrado, veio ao na execução novamente dos testes automatizados e verificar que continuavam todos verdes.

4. No Ciclo 8, por que alteramos os testes antes de mudar o código?
   Porque em TDD, os testes funcionam como uma especificação do sistema. Primeiro, foram modificados ou criados os testes para descrever o novo comportamento exigido pelo requisito (fazendo-os falhar) e, somente após, foram feitas as alterações do código de produção para satisfazê-los.

5. Qual ciclo foi o mais difícil para você, e por quê?
   É dificíl de escolher, devido ao fato de que, todos os ciclos possuem o seu desafio pessoal.
