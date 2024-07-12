package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("Servindo a mesa");
    }

    private void pegarLancheCozinha(){
        System.out.println("Pegando o lanche na cozinha");
    }

    public void receberPagamento (){
        System.out.println("Recebendo pagamento");
    }

     void trocarGas (){
        System.out.println("Atendente trocando o gás");
    }

    private void pegarPedidoBalcao (){
        System.out.println("Pegando o pedido no balcão");
    }
}
