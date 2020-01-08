package com.company;

import java.util.Date;
import com.company.FullName;
import com.company.Address;
import com.company.Phone;
import com.company.Gender;
import com.company.History;


public class Person {
    String title, givenName, middleName, familyName;
    private FullName name;
    Date birthDate;
    Gender gender;
    Address homeAdress;
    Phone phone;


    public Person(String title, String givenName, String middleName, String familyName, Date birthDate, Address homeAdress, Phone phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = new FullName(givenName, middleName, familyName);
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAdress = homeAdress;
        this.phone = phone;

    }
}

