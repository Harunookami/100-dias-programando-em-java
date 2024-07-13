public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa daniela = new Pessoa("76589098723", "Daniela");

        daniela.setEndereco("Pedra do Dragão");

        System.out.println(daniela.getNome() + " - " + daniela.getCpf());
    }
}