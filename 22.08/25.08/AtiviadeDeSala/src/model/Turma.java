package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

abstract class Turma {
    private Set<Aluno> aluno = new HashSet<>();
    private List<Avaliacao> avaliacao = new ArrayList<>();


    public void matricularAluno(Aluno aluno) {
        this.aluno.add(aluno);
    }
    public void desmatricularAluno(Aluno aluno) {
        this.aluno.remove(aluno);
    }
}
