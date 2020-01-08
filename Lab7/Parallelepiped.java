package com.company;

public class Parallelepiped implements GeometricBody {
    double l, h, L;
    public Parallelepiped(double l, double h, double L){
        this.l = l;
        this.h = h;
        this.L = L;
    }
    @Override
    public double getVolume(){
        return L*l*h;
    }
    @Override
    public double getSurface(){
        return 2*L*h + 2*l*h + 2*L*l;
    }
}