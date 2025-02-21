import java.util.Scanner;

public class JessicaEx6 {
    public static void main(String[] args) {
        int[] A, B;
        int total = 20;
        A = new int[total];
        B = new int[total];
        int i, j, aux;
        Scanner entra = new Scanner(System.in);

        // preenchendo o vetor A
        for (i = 0; i < total; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor do vetor A: ");
            A[i] = entra.nextInt();
        }

        // preenchendo o vetor B
        for (i = 0; i < total; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor do vetor B: ");
            B[i] = entra.nextInt();
        }

        // mostrando vetor A antes da troca
        System.out.println("\nVetor A antes da troca:");
        for (i = 0; i < total; i++) {
            System.out.print(A[i] + " | ");
        }

        // mostrando vetor B antes da troca
        System.out.println("\nVetor B antes da troca:");
        for (i = 0; i < total; i++) {
            System.out.print(B[i] + " | ");
        }

        // realizando a troca dos elementos
        j = total - 1;
        for (i = 0; i < total; i++) {
            aux = A[i];
            A[i] = B[j];
            B[j] = aux;
            j--;
        }

        // mostrando vetor A depois da troca
        System.out.println("\nVetor A depois da troca:");
        for (i = 0; i < total; i++) {
            System.out.print(A[i] + " | ");
        }

        // mostrando vetor B depois da troca
        System.out.println("\nVetor B depois da troca:");
        for (i = 0; i < total; i++) {
            System.out.print(B[i] + " | ");
        }

        // fechando o scanner
        entra.close();
    }
}
		