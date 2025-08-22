package control;

import model.Curso;
import model.Disciplina;
import model.Turma;

public class Programa {
    public static void main(String[] args) {
        Curso curso = new Curso("Engenharia de Software");
        Disciplina di = new Disciplina("Testecodigo", "Tecnicas avancadas", 80);
        Turma turma = new Turma("Codigo turma", "segunda", di);

        curso.addDisciplina(di);
        di.addCurso(curso);
        di.addTurma(turma);



        // Imprime somente o nome das disciplinas do curso engenharia de software
        System.out.println("Disciplinas do curso " + curso.getNome() + ":");
        for (Disciplina disciplina : curso.getDisciplinas()) {
            System.out.println(disciplina.getNome());
        }

        // listar o código de todas as turmas de engenharia de software
    }
}