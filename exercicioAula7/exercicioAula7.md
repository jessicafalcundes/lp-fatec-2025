#### Faça uma pesquisa a fim de diferenciar String, StringBuffer e StringBuilder. Crie uma situação (problema) em que será necessário usar os três itens mencionados anteriormente.
* Obs1: O programa desenvolvido não deverá usar conceitos de vetores, matrizes ou métodos do tipo static;
* Obs2: O programa desenvolvido não deverá conter explicações (nem em forma de comentários, nem em forma de impressão via "System.out.print");
* Obs3: Inserir no início do código o enunciado do problema, a fim de destacar o objetivo do programa.

#### PESQUISA – Diferenças entre String, StringBuffer e StringBuilder

| Tipo           | Mutável? | É sincronizado (thread-safe)? | Indicado para...                             |
|----------------|----------|-------------------------------|----------------------------------------------|
| `String`       | ❌ Não    | ✅ Sim (por ser imutável)      | Quando o texto não precisa ser alterado com frequência. Ideal para dados fixos. |
| `StringBuffer` | ✅ Sim    | ✅ Sim                         | Quando várias threads podem acessar e modificar o texto. Mais seguro em ambiente multithread. |
| `StringBuilder`| ✅ Sim    | ❌ Não                         | Quando o texto será alterado em apenas uma thread. Mais rápido que o `StringBuffer`. |


#### Enunciado do Problema

Uma biblioteca está montando um sistema de registro de empréstimos.  
O registro é composto por três partes:

1. **Cabeçalho fixo** com o nome da biblioteca (que nunca muda);
2. **Conteúdo** com informações do empréstimo (como dados do livro, nome do usuário, data), que pode ser alterado por vários atendentes ao mesmo tempo;
3. **Observação final**, que é modificada apenas por um bibliotecário responsável (por exemplo: “renovação autorizada” ou “entrega com atraso”).

Implemente esse comportamento utilizando:

- `String` para o cabeçalho fixo;
- `StringBuffer` para o conteúdo que pode ser alterado por múltiplas pessoas (thread-safe);
- `StringBuilder` para a observação final, manipulada por uma única pessoa (não precisa ser thread-safe).

**Regras:**
- O programa **não** pode utilizar vetores, matrizes ou métodos `static`;
- O código **não** pode conter comentários ou impressões (`System.out.print`) explicativas;
- O enunciado **deve** ser incluído no início do código.

