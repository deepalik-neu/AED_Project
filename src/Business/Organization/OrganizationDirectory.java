/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String realName){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HospitalCoordinator.getValue())){
            organization = new HospitalCoordinatorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pathologist.getValue())){
            organization = new PathologistOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createAuthorizationOrganization(Organization.AuthorizationType legalType, String realName){
        Organization organization = null;
        if (legalType.getValue().equals(Organization.AuthorizationType.Authorization.getValue())){
            organization = new AuthorizationOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
     public Organization createPlasmaOrganization(Organization.PlasmaBankType plasmaType, String realName){
        Organization organization = null;
        if (plasmaType.getValue().equals(Organization.PlasmaBankType.PlasmaBank.getValue())){
            organization = new PlasmaBankOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
     public Organization createCovidCentreOrganization(Organization.CovidCentreType covidType, String realName){
        Organization organization = null;
        if (covidType.getValue().equals(Organization.CovidCentreType.CovidCentre.getValue())){
            organization = new CovidCentreOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
      public Organization createPortalAdminOrganization(Organization.PortalAdminType govtType, String realName){
        Organization organization = null;
        if (govtType.getValue().equals(Organization.PortalAdminType.PortalAdmin.getValue())){
            organization = new PortalAdminOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
}