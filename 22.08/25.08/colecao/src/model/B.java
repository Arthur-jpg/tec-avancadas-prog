package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class B {

    private Set<C> colecaoDeC = new HashSet<>();
    private A a;

    public B(A a) {
        this.a = a;
    }

    public Set<C> getC() {
        return colecaoDeC;
    }

    public void setC(Set<C> c) {
        this.colecaoDeC = c;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void addC(C c) {
        this.colecaoDeC.add(c);
    }

    public void removeC(C c) {
        this.colecaoDeC.remove(c);
    }
}
