/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.PlasmaBankCoordinatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author namita
 */
public class PlasmaBankOrganization extends Organization{

    public PlasmaBankOrganization() {
        super(Organization.PlasmaBankType.PlasmaBank.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PlasmaBankCoordinatorRole());
        return roles;
    }
     
}
