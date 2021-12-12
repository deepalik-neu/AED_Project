/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.Date;

/**
 *
 * @author namita
 */
public class DonorRequest {
    private String id;
    private String name;
    private String address;
    private String age;
    private String gender;
    private String bloodGroup;
    private Date covidDiagnosisDate;
    private Date covidCuredDate;
    private String contact;
    private String emailID;
    private String symptoms;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

   

    public String getContact() {
        return contact;
    }

    public String getEmailID() {
        return emailID;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Date getCovidDiagnosisDate() {
        return covidDiagnosisDate;
    }

    public void setCovidDiagnosisDate(Date covidDiagnosisDate) {
        this.covidDiagnosisDate = covidDiagnosisDate;
    }

    public Date getCovidCuredDate() {
        return covidCuredDate;
    }

    public void setCovidCuredDate(Date covidCuredDate) {
        this.covidCuredDate = covidCuredDate;
    }


    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    @Override
    public String toString() {
    return id;
}
   
    
}
    