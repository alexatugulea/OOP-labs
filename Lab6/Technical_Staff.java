package com.company;
import java.util.Date;
public class Technical_Staff extends Staff {
    Patient[] patients;

    public Technical_Staff(Person person, Date joined, String[] education, String[] certification, String[] languages) {
        super(person, joined, education, certification, languages);
    }
}
