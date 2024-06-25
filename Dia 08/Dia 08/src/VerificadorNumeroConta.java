import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Digite o número da conta: ");
            String numeroConta = scanner.nextLine();

            verificadorNumeroConta(numeroConta);
            
            System.out.println("Número de conta válido.");

        }   catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
        }   finally {

            scanner.close();

        }
    }

    private static void verificadorNumeroConta(String numeroConta) {

        if ( numeroConta == null || numeroConta.length() != 8) {
            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");

        }
    }

}