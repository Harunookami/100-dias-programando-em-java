package application;

import Entidade.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.println("Números de produtos para ser adicionado no estoque: ");
        int quantidade = sc.nextInt();
        produto.addProducts(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.println();
        System.out.println("Números de produtos para ser removido do estoque: ");
        quantidade = sc.nextInt();
        produto.removeProducts(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        sc.close();
    }
}