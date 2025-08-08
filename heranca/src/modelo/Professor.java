package modelo;

public class Professor extends Pessoa {
    private String titulacao;

    public Professor(String nome, String telefone, String titulacao) {
        super(nome, telefone);
        this.titulacao = titulacao;
    }
    public String getTitulacao() {
        return titulacao;
    }

}
