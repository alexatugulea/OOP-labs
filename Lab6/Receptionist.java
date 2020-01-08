package com.company;

import java.util.Date;

public class Receptionist extends Front_Desk_Staff {
    public Receptionist(Person person, Date joined, String[] education, String[] certification, String[] languages){
        super(person, joined, education, certification, languages);
    }
}
