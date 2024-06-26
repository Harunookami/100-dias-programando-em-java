import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo atual da conta: ");
        double saldo = scanner.nextDouble();

        System.out.print("Informe quanto você quer sacar: ");
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500;

        if(saldo >= saque ){
            System.out.println("Transação realizada com sucesso.");
        } else if (saque <= saldo + limiteChequeEspecial){
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transação não realizada. Limite de cheque especial excedido.");

        }

        scanner.close();
        }
}
