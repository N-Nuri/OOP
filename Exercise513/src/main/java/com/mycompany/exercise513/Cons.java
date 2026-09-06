package com.mycompany.exercise513;

public class Cons extends AList {
    private Object first;
    private AList rest;

    public Cons(Object first, AList rest) {
        this.first = first;
        this.rest = rest;
    }
}
