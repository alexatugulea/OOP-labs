package com.company;

public class GeometricBodyController {
    public static GeometricBody getMaxVolume(GeometricBody[] list){
        GeometricBody toReturn = list[0];
        double maxVolume = list[0].getVolume();
        for(int i = 0; i < list.length; i++) {
            if (list[i].getVolume() > maxVolume)
            {
                toReturn = list[i];
                maxVolume = list[i].getVolume();
            }
        }
            return toReturn;
        }

    public static GeometricBody getMaxSurface(GeometricBody[] list){
        GeometricBody toReturn = list[0];
        double maxSurface = list[0].getSurface();
        for(int i = 0; i < list.length; i++){
            if (list[i].getSurface() > maxSurface) {
                toReturn = list[i];
                maxSurface = list[i].getSurface();
            }
        }
        return toReturn;
    }

}
