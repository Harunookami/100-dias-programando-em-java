import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        //começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
        //exemplo.
        
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int primeiro = i;
            int segundo = i*i;
            int terceiro = i * i *i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }
    }
}