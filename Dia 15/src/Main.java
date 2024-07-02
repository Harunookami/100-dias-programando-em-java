import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercicio:
        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //
        //Fórmula da área: area = π . raio2
        //
        //Considere o valor de π = 3.14159

        // Define o padrão de localidade para os EUA
        // Isso afeta a formatação de números e datas (ponto decimal, etc.)
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);


        // Declara e inicializa variáveis:
        // 'R' será o raio do círculo
        // 'A' será a área do círculo (inicialmente não precisa ser inicializada com um valor)
        // 'pi' é o valor de π, aproximadamente 3.14159
        double R = 3.14159;
        double A = 3.14159;
        double pi = 3.14159;

        R = sc.nextDouble();

        // Calcula a área do círculo usando a fórmula: área = π * raio^2
        A = pi * R * R;

        // Exibe a área calculada com quatro casas decimais
        System.out.printf("A = %.4f\n", A);

        sc.close();

    }
}