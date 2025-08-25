package model;

import java.util.HashSet;
import java.util.Set;

public class Aluno extends Pessoa{

    private String documento;
    private String matricula;
    private Set<Turma> turma = new HashSet<>();

    public Aluno( String documento, String matricula) {
        super(null, null);
        this.documento = documento;
        this.matricula = matricula;
    }

    @Override
    public String identificacao() {
        return matricula;
    }
}
