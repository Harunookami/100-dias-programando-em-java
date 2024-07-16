

public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA","Maranhão"),
    CEARA ("CE","Ceará"),
    BAHIA ("BA","Bahia"),
    AMAZONAS("AM","Amazonas"),
    ;

    private String nome;
    private String sigla;


    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
    

    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}
