/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        
        //types
       if(type==Enterprise.EnterpriseType.Hospital){
           //Hospital
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Authorization){
            //Authorization
            enterprise=new AuthorizationEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.PortalAdmin){
            //PortalAdmin
            enterprise=new PortalAdminEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.PlasmaBank){
            //PlasmaBank
            enterprise=new PlasmaBankEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.CovidCentre){
            //CovidCentre
            enterprise=new CovidCentreEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
