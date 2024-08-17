import javax.swing.*;

public class main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Nome do personagem");
        String classe = JOptionPane.showInputDialog(null, "Classe do personagem");


        Personagem mago = new Personagem(nome, classe);
        mago.mostrarStatus();
    }
}
