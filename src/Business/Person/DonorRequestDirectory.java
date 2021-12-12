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
public class DonorRequestDirectory {
    
    private ArrayList<DonorRequest> dnrList;

//    public ArrayList<DonorRequest> getDonorRequestList() 
//    {
//        return dnrList;
//    }
    
    public DonorRequestDirectory()
    {
        dnrList = new ArrayList<DonorRequest>();
    }

    public ArrayList<DonorRequest> getDnrList() {
        return dnrList;
    }
 
    public void setDnrList(ArrayList<DonorRequest> dnrList)
    {
        this.dnrList = dnrList;
    }

    //add request
    public DonorRequest addDonorRequest() {
        DonorRequest donorRequest = new DonorRequest();
        dnrList.add(donorRequest);
        return donorRequest;
    }
    //remove request
    public DonorRequest removeDonorRequest(DonorRequest dnr)
    {
        dnrList.remove(dnr);
        return null;
    
    }
}