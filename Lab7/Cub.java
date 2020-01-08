package com.company;

public class Cub implements GeometricBody {
    double l;
    public Cub(double l){ this.l = l;}
    @Override
     public double getVolume(){
        return l*l*l;
    };
    @Override
    public double getSurface(){
        return l*l*6;
    }
}
