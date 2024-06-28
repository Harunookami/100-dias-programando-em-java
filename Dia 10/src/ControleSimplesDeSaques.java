import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o limite diário do usuário
        System.out.print("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();

        double limiteRestante = limiteDiario; 
        int numSaques = 0;

        while (true) {

            System.out.print("Informe o valor do saque (ou 0 para encerrar): ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            } else if (valorSaque > limiteRestante) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break;
            } else {

                limiteRestante -= valorSaque;
                numSaques++;

                System.out.printf("Saque %d: %.2f\n", numSaques, valorSaque);
                System.out.printf("Limite restante: %.2f\n", limiteRestante);
            }
        }

        scanner.close();
    }
}
