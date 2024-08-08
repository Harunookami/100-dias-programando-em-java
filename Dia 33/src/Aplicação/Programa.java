package Aplicação;

import Utilitarios.Calculadora;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um valor númerico qualquer, e daí mostrar quando seria o valor
// de uma circunferência e do volume de uma esfera para um raio daquele valor. Informar tamém
// o valor de PI com duas casas decimais.

public class Programa {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();


        double c = Calculadora.circumference(radius);

        double v = Calculadora.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculadora.PI);

        sc.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume (double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}