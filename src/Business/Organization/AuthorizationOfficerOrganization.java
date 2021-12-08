/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.AuthorizationOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author namita
 */
public class AuthorizationOfficerOrganization extends Organization{

    public AuthorizationOfficerOrganization() {
        super(Organization.LegalType.LegalOfficer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AuthorizationOfficerRole());
        return roles;
    }
     
}
