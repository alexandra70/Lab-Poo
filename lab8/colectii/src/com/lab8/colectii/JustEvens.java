package com.lab8.colectii;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

//HASHSET E NEORDONAT SI NESORATAT, DAR SE CALCULEAZA UN HASH;
//HASHTREE - ESTE UN SET ORDONAT DE ELEMENTE LE PUNE IN ORDINE;
//LINKEDLISTSET E SET ORDONAT;

public class JustEvens extends TreeSet<Integer> {

    private LinkedList<Integer> list;

    public JustEvens(){
        this.list = new LinkedList<Integer>();
    }

    @Override
    public boolean add(Integer integer) {

        if(integer%2 !=0)
            return false;

        return super.add(integer);
    }
}
