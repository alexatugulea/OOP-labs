package com.company;

import java.util.Date;

public class Technician extends Technical_Staff {
    public Technician(Person person, Date joined, String[] education, String[] certification, String[] languages){
        super(person, joined, education, certification, languages);
    }
}
