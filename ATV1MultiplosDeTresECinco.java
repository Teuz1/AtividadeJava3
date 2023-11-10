import java.util.Scanner;

public class ATV1MultiplosDeTresECinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número do intervalo: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        int ultimoNumero = scanner.nextInt();

        // Verificação do intervalo
        if (primeiroNumero >= ultimoNumero) {
            System.out.println("Intervalo inválido!");
        } else {
            System.out.println("No Intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");

            // Loop for para encontrar múltiplos de 3 e 5 no intervalo
            for (int i = primeiroNumero; i <= ultimoNumero; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
