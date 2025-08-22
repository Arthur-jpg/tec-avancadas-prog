package model;

public class Turma {
    private String codigo;
    private String horario;

    // Relacionamento com multiplicidade 1 com a calasse disciplina
    private Disciplina disciplina;

    public Turma(String codigo, String horario, Disciplina disciplina) {
        this.codigo = codigo;
        this.horario = horario;
        this.disciplina = disciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
