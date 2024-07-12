package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class cozinheiro {

    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural hambúrguer no balcão");
    }

    public void adicionarSucoNoBalcao (){
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarComboNoBalcao (){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("Preparando lanche tipo hambúrguer");
    }

    private void prepararVitamina(){
        System.out.println("Preparando suco");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionado fruta, leite e suco");
    }

    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }

    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo Vitamina Liquidificador");
    }

    private void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e ovo para o hambúrguer");
    }


    private void pedirParaTrocarGas (Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes (Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
