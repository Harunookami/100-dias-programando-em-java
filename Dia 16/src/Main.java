import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;


        // Lê quatro inteiros do usuário e os armazena nas variáveis A, B, C e D
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        // Calcula a diferença do produto de A e B pelo produto de C e D
        int DIFERENCA = (A * B - C * D);

        // Exibe o resultado da diferença
        System.out.println("DIFERENÇA = " + DIFERENCA);

            sc.close();
    }
}