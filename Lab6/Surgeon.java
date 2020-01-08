package com.company;

import java.util.Date;

public class Surgeon extends Doctor{
    public Surgeon(Person person, Date joined, String[] education, String[] certification, String[] languages, String[] specialty, String[] locations){
        super(person, joined, education, certification, languages, specialty, locations);
    }
}
