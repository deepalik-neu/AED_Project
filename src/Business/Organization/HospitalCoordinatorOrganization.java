/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.HospitalCoordinatorRole;
import java.util.ArrayList;

/**
 *
 * @author namita
 */
public class HospitalCoordinatorOrganization  extends Organization {

    public HospitalCoordinatorOrganization() {
        super(Organization.Type.HospitalCoordinator.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
           ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalCoordinatorRole());
        return roles;
    }
    
}
