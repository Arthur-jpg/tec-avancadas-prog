package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private List<Turma> turma = new ArrayList<>();

    public Disciplina(List<Turma> turma) {
        this.turma = turma;
    }
}
