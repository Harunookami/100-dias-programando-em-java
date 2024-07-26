package Entidades;

// Fazer um programa para ler os valores da largura e altura
//de um retângulo. Em seguida, mostrar na tela o valor de
//sua área, perímetro e diagonal. Usar uma classe como
//mostrado no projeto ao lado.

import Aplicação.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Retangulo rect = new Retangulo();

        System.out.println("Insira a altura e largura do retângulo: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("Area: %.2f\n", rect.area());
        System.out.printf("Perimetro: %.2f\n", rect.perimetro());
        System.out.printf("Diagonal: %.2f\n", rect.diagonal());


    }
}
