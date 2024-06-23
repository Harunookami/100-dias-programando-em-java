import java.util.Scanner;

public class VericadorElegibilidadeConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite a sua idade: ");
           int idade = scanner.nextInt();

        if ( idade >= 18) {
            System.out.println("Você está elegivel para criar uma conta bancária.");
        }
         else {

            System.out.println("Você não está elegivel para criar uma conta bancária. ");
        }
            scanner.close();
    }
}
