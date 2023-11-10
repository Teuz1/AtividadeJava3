import java.util.Scanner;

public class ATV2ContagemIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialização das variáveis de contagem
        int totalMenores21 = 0;
        int totalMaiores50 = 0;

        // Leitura das idades e contagem
        System.out.print("Digite uma idade: ");
        int idade = scanner.nextInt();

        while (idade >= 0) {
            if (idade < 21) {
                totalMenores21++;
            } else if (idade > 50) {
                totalMaiores50++;
            }

            System.out.print("Digite uma idade: ");
            idade = scanner.nextInt();
        }

        // Saída dos resultados
        System.out.println("\nTotal de pessoas menores de 21 anos: " + totalMenores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + totalMaiores50);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
