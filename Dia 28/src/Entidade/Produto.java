package Entidade;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalValueInStock(){
        return preco*quantidade;
    }

    public void addProducts(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
             + ", $ "
             + String.format("%.2f", preco)
             + ", "
             + quantidade
             + " unidades, Total: $"
             + String.format("%.2f", totalValueInStock());
    }

}
