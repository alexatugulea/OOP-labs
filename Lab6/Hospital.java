package com.company;

import com.company.FullName;
import com.company.Address;
import com.company.Phone;

public class Hospital {
    String name;
    Address adress;
    Phone phone;
    Department[] departments;

    public Hospital(String name, Address adress, Phone phone, Department[] departments){
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.departments = departments;
    }
}
