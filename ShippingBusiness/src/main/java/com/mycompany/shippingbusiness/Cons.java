package com.mycompany.shippingbusiness;

public class Cons extends APackageList {
    protected Package first;
    protected APackageList rest;

    public Cons(Package first, APackageList rest) {
        this.first = first;
        this.rest = rest;
    }
}
