package control;

import model.A;
import model.B;
import model.C;

public class Programa {
    public static void main(String[] args) {


        A a = new A();
        B b1 = new B(a);
        B b2 = new B(a);
        C c1 = new C(b1);
        C c2 = new C(b1);


        a.addListDeB(b1);
        a.addListDeB(b2);
        a.addListDeB(b1);

        a.addSetDeB(b1);
        a.addSetDeB(b2);
        a.addSetDeB(b1);


        // Bidirecionalidade -> amarrei C em b1 lá em cima agora aqui em baixo amarrei B1 em C1 
        b1.addC(c1);
        b1.addC(c2);


        System.out.println(a.getListDeB().size());
        // para demonstrar que a array permite duplicatas e o set não

        System.out.println(a.getSetDeB().size());





    }
}
