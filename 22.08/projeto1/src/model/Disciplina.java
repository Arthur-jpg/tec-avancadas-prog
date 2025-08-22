package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigo;
    private String nome;
    private int ch;

    private List<Turma> turmas = new ArrayList<Turma>();
    private List<Curso> cursos = new ArrayList<>();

    public Disciplina(String codigo, String nome, int ch) {
        this.codigo = codigo;
        this.nome = nome;
        this.ch = ch;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }
    public void removeCruso(Curso curso) {
        this.cursos.remove(curso);
    }

    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }
    public void removeTurma(Turma turma) {
        this.turmas.remove(turma);
    }
}
