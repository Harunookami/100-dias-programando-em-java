import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
        //Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
        //programa.

        char resp;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
             double celsius = sc.nextDouble();
             double fahrenheit = 9.0 * celsius / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
            System.out.println("Deseja repetir (s/n)? ");
             resp = sc.next().charAt(0);
        } while(resp != 'n');

        sc.close();
    }
}