/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author namita
 */
public class PatientRequestDirectory {
    private ArrayList<PatientRequest> prList;

    public ArrayList<PatientRequest> getPrList() 
    {
        return prList;
    }
    public void setPrList(ArrayList<PatientRequest> prList) 
    {
        this.prList = prList;
    }
    
    public PatientRequestDirectory(){
        prList = new ArrayList<PatientRequest>();
    }
    
    public PatientRequest addPatientRequest()
    {
        PatientRequest patientRequest = new PatientRequest();
        prList.add(patientRequest);
        return patientRequest;
    }
    
    public DonorRequest removePatientRequest(PatientRequest p)
    { 
        prList.remove(p);
        return null;
    }
    
}
