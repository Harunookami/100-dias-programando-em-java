
import java.util.Scanner;

public class SalarioMinimo {
    public static void main (String[] args) {

        final double SALARIO_MINIMO = 1.412; // Valor do salário mínimo em reais

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor do salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        // Calculando a quantidade de salários mínimos que o usuário ganha
        double quantidadeSalarisMinimos = salarioUsuario / SALARIO_MINIMO;

        System.out.println("O usuário ganha aproximadamente" + quantidadeSalarisMinimos + "salários mínimos." );

        scanner.close();
    }
}