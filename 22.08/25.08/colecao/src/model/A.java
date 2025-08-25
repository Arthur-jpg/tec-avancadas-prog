package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A {
    private List<B> listDeB = new ArrayList<>();
    private Set<B> setDeB = new HashSet<>();

    public List<B> getListDeB() {
        return listDeB;
    }

    public void setListDeB(List<B> listDeB) {
        this.listDeB = listDeB;
    }

    public Set<B> getSetDeB() {
        return setDeB;
    }

    public void setSetDeB(Set<B> setDeB) {
        this.setDeB = setDeB;
    }
    public void addListDeB(B b){
        listDeB.add(b);
    }
    public void addSetDeB(B b) {
        setDeB.add(b);
    }
}
