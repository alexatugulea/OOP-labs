package com.company;
import static com.company.GeometricBodyController.*;

import static com.company.GeometricBodyController.getMaxSurface;
import static com.company.GeometricBodyController.getMaxVolume;

public class Main {

    public static void main(String[] args) {
        GeometricBody[] list = {new Sphere(4), new Cub(5), new Parallelepiped(5,2,4)};
        System.out.println("Max Volume : " + GeometricBodyController.getMaxVolume(list).getVolume());
        System.out.println("Max Surface : " + GeometricBodyController.getMaxSurface(list).getSurface()+ "\n");

        for (int i =0; i < list.length; i++){
        System.out.println("Body Surface : " + list[i].getSurface());
        System.out.println("Body Volume : " + list[i].getVolume() + "\n");
    }
  }
}
