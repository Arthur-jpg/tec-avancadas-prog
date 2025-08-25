package model;

public class Professor extends Pessoa{
    private String siape;
    private String documento;

    public Professor(String siape, String documento) {
        super(null, null);
        this.siape = siape;
        this.documento = documento;
    }

    @Override
    public String identificacao() {
        return siape;
    }
}
