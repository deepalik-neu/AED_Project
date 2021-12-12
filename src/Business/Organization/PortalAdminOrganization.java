/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.PortalAdminRole;
//import Business.Role.PathologistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author namita
 */
public class PortalAdminOrganization extends Organization{
    
    public PortalAdminOrganization() {
        super(Organization.Type.PortalAdmin.getValue());
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new  ArrayList();
        roles.add(new PortalAdminRole());
        return roles;
    }
    
    
}
