import java.util.Scanner;

public class ATV3SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialização das variáveis
        int numero;
        int somaPositivos = 0;

        // Leitura dos números e soma dos positivos
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            }

        } while (numero != 0);

        // Saída do resultado
        System.out.println("\nA soma dos números positivos é: " + somaPositivos);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
