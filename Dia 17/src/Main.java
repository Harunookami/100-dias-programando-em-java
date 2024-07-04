import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
       String funcionario = sc.nextLine();

        System.out.print("Digite as horas trabalhadas do funcionário: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor recebido por hora: ");
        double valorHora = sc.nextDouble();

      double soma = (horasTrabalhadas * valorHora);

       System.out.println("Número = " + funcionario);
       System.out.printf("Salário = R$ %.2f%n", soma);
    }
}