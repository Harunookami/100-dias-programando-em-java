import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A;
        int B;

        System.out.println("Digite um número: ");
        A = sc.nextInt();

        System.out.println("Digite um número: ");
        B = sc.nextInt();

        int soma = A + B;

        System.out.println("SOMA = " + soma);

    }
}