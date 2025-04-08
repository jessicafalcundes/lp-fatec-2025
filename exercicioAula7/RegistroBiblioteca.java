/*
Uma biblioteca está montando um sistema de registro de empréstimos. 
O registro é composto por três partes:
1. Um cabeçalho fixo com o nome da biblioteca (que nunca muda);
2. Um conteúdo que pode ser alterado por vários atendentes ao mesmo tempo (como dados do livro, nome do usuário, data do empréstimo);
3. Uma observação final adicionada por apenas um bibliotecário responsável (como “renovação autorizada” ou “entrega com atraso”).

Implemente esse comportamento utilizando:
- String para o cabeçalho fixo;
- StringBuffer para o conteúdo alterado por múltiplos atendentes;
- StringBuilder para a observação final.
*/

public class RegistroBiblioteca {
    String cabecalho;
    StringBuffer conteudo;
    StringBuilder observacao;

    public RegistroBiblioteca(String cabecalho, StringBuffer conteudo, StringBuilder observacao) {
        this.cabecalho = cabecalho;
        this.conteudo = conteudo;
        this.observacao = observacao;
    }

    public void exibirRegistro() {
        conteudo.append(" Livro: Estruturas de Dados em Java");
        conteudo.append(" | Usuário: Ana Lima");
        conteudo.append(" | Empréstimo: 06/04/2025");
        observacao.append(" Devolução prorrogada até 20/04/2025.");
        String registro = cabecalho + "\n" + conteudo.toString() + "\n" + observacao.toString();
        System.out.println(registro);
    }

    public static void main(String[] args) {
        RegistroBiblioteca registro = new RegistroBiblioteca(
            "Biblioteca Municipal Central - Registro de Empréstimo",
            new StringBuffer("Registro iniciado por atendente ID 003."),
            new StringBuilder()
        );
        registro.exibirRegistro();
    }
}


