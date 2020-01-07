package com.company;

public class C extends B {
    protected String c;

    public C(String a, String b, String c, X x) {
        super(a, b, x);
        this.c = c;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(c);
        System.out.println("");
    }
}
