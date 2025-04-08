// ContaEspacos.java
import java.util.Scanner;

public class ContaEspacos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        int contadorEspacos = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contadorEspacos++;
            }
        }

        System.out.println("A frase digitada possui " + contadorEspacos + " espaços.");
        
        scanner.close();
    }
}
