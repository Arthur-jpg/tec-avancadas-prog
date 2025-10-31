package control;

import model.A;

public class B extends A {
    public void mostrarNome() {
        System.out.println(this.nome);

    }

    @Override
    protected void teste() {
        super.teste();
    }
}
