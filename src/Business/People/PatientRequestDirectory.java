/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author namita
 */
public class PatientRequestDirectory {
    
    
    private ArrayList<PatientRequest> patientRequestList;

    public ArrayList<PatientRequest> getPatientRequestList() {return patientRequestList;}
    public void setPatientRequestList(ArrayList<PatientRequest> patientRequestList) {this.patientRequestList = patientRequestList;}
    
    public PatientRequestDirectory(){
        patientRequestList = new ArrayList<PatientRequest>();
    }
    
    public PatientRequest addPatientRequest()
    {
        PatientRequest patientRequest = new PatientRequest();
        patientRequestList.add(patientRequest);
        return patientRequest;
    }
    
    public DonorRequest removePatientRequest(PatientRequest p)
    {
        //DonorRequest donorRequest = new DonorRequest();
        //this.donor = donor
        patientRequestList.remove(p);
        //return donorRequest;
        return null;
    }
    
    
    
    
}