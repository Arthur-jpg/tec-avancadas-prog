package model;

abstract class Pessoa {
    private String nome;
    private String documento;

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    // contrato de identificação
    public abstract String identificacao();

    // getters opcionais
    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }
}
