package com.company;
import java.util.Date;
public class Doctor extends Operations_Staff {
    public String[] specialty;
    public String[] locations;

    public Doctor(Person person, Date joined, String[] education, String[] certification, String[] languages, String[] specialty, String[] locations) {
        super(person, joined, education, certification, languages);
        this.specialty = specialty;
        this.locations = locations;
      }

}

