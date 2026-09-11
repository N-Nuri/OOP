package com.mycompany.trainschedule;

public class Cons extends StopList {
    protected String first;
    protected StopList rest;

    public Cons(String first, StopList rest) {
        this.first = first;
        this.rest = rest;
    }
}
