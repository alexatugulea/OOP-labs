package com.company;
import java.util.Date;
import com.company.FullName;
import com.company.Gender;
import com.company.History;

public class Patient extends Person {
    public String id;
    Integer age;
    Date accepted;
    History sickeness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;
    Operations_Staff[] operations_staffs;
    public Patient(Person person, String id, Integer age, Date accepted,History sickeness, String[] prescriptions, String[] allergies, String[] specialReqs){
        super(person.title, person.givenName, person.middleName, person.familyName, person.birthDate, person.gender);
        this.id = id;
        this.age = age;
        this.accepted = accepted;
        this.sickeness = sickeness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;


    }
}
