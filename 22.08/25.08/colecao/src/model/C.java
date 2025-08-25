package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C {

    private Set<B> colecaoDeb = new HashSet<>();

    public C(B b) {
        this.colecaoDeb.add(b);
    }

    public Set<B> getColecaoDeb() {
        return colecaoDeb;
    }

    public void setColecaoDeb(Set<B> colecaoDeb) {
        this.colecaoDeb = colecaoDeb;
    }

    public void addB(B b) {
        this.colecaoDeb.add(b);
    }

    public void removeB(B b) {
        this.colecaoDeb.remove(b);
    }
}
