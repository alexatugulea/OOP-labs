package com.company;

public class Sphere implements GeometricBody {
    double r;
    public Sphere(double r){ this.r=r;}

    @Override
    public double getVolume(){
        double volumeSphere = (4 / 3)* Math.PI * Math.pow(r, 3);
        return volumeSphere;
    }
    @Override
    public double getSurface(){
        return 4 * Math.PI * Math.pow(r, 2);
    }
}