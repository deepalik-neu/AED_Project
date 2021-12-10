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
public class DonorRequestDirectory {
    
    
    private ArrayList<DonorRequest> donorRequestList;

    public ArrayList<DonorRequest> getDonorRequestList() {return donorRequestList;}
    public void setDonorRequestList(ArrayList<DonorRequest> donorRequestList) {this.donorRequestList = donorRequestList;}
    
    public DonorRequestDirectory(){
        donorRequestList = new ArrayList<DonorRequest>();
    }
    
    public DonorRequest addDonorRequest()
    {
        DonorRequest donorRequest = new DonorRequest();
        donorRequestList.add(donorRequest);
        return donorRequest;
    }
    public DonorRequest removeDonorRequest(DonorRequest donor)
    {
        //DonorRequest donorRequest = new DonorRequest();
        //this.donor = donor
        donorRequestList.remove(donor);
        //return donorRequest;
        return null;
    }
}
