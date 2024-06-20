
import java.util.Scanner;

public class ReajusteSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o saldo atual
        System.out.print("Informe o saldo atual: ");
        double saldo = scanner.nextDouble();

        // Calcula o saldo com reajuste de 1%
        double saldoReajustado = saldo * 1.01; // 1% de aumento

        System.out.println("O saldo com reajuste de 1% é: " + saldoReajustado);


    }
}
