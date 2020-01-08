package com.company;

import java.util.Date;

public class Technologist extends Technical_Staff {
    public Technologist(Person person, Date joined, String[] education, String[] certification, String[] languages){
        super(person, joined, education, certification, languages);
    }
}
