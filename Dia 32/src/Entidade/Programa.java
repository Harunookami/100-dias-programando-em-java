package Entidade;

import Aplicação.Funcionario;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
//seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
//salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
//afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
//projetada abaixo.

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome;
        double salarioBruto;
        double taxa;
        double salarioLiquido = 0;

        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.printf("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Taxa: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println();
        System.out.printf("Funcionário: " + funcionario);
        System.out.println();

        System.out.println("Qual a porcentagem para aumentar o salário? ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);


        sc.close();

    }
}