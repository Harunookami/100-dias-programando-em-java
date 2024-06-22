import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("|=======Seja-bem vindo=======|");
        
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
                contar(parametroUm, parametroDois);
        } catch ( ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
              
    }

    static void contar (int parametroUm, int parametroDois ) throws Exception {
        if (parametroUm >= parametroDois) {
            throw new  ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroUm - parametroDois;
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " +i);
        }
    }
}
