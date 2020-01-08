package com.company;
import java.util.Date;
public class Nurse extends Operations_Staff {
    public Nurse(Person person, Date joined, String[] education, String[] certification, String[] languages){
        super(person, joined, education, certification, languages);
    }
}
