package com.company.Question3;

import java.time.LocalDate;

public class PersonalData {
    private LocalDate birtDate;
    private String address;
    private long ssn;



    public PersonalData(LocalDate birtDate, long ssn){

    }
    public PersonalData(int year,int month,int day,long ssn){
        birtDate=LocalDate.of(year,month,day);
    }

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public String getAddress() {
        return address;
    }

    public long getSsn() {
        return ssn;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
