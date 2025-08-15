package control;

import model.Falcao;
import model.PicaPau;
import model.Pinguim;

import javax.xml.transform.Source;

public class Programa {
    public static void main(String[] args) {
        PicaPau picaPau = new PicaPau();
        Pinguim pinguim = new Pinguim();
        Falcao falcao = new Falcao();

        System.out.println(picaPau.bicar());
        System.out.println(picaPau.voar());

        System.out.println(pinguim.bicar());
        System.out.println(pinguim.nadar());

        System.out.println(falcao.voar());
        System.out.println(falcao.bicar());;

    }
}
