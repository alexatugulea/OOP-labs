package com.company;
import java.util.Date;

public class Staff extends Person {
    Date joined;
    public String[] education;
    public String[] certification;
    public String[] languages;


    public Staff(Person person, Date joined, String[] education, String[] certification, String[] languages) {
        super(person.title, person.givenName, person.middleName, person.familyName, person.birthDate, person.gender, person.homeAdress, person.phone, joined, education, certification, languages);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }
}