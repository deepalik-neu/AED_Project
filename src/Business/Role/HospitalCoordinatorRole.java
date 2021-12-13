/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.HospitalCoordinatorOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
<<<<<<< HEAD:src/Business/Role/PlasmaBankAdminRole.java
import ui.PathologistRole.PathologistWorkAreaPanel;
import ui.PlasmaBankAdminRole.PlasmaBankOfficerWorkAreaPanel;
=======
import ui.HospitalCoordinatorRole.HospitalCoordinatorWorkAreaPanel;
>>>>>>> dev-namitam:src/Business/Role/HospitalCoordinatorRole.java

/**
 *
 * @author namita
 */
<<<<<<< HEAD:src/Business/Role/PlasmaBankAdminRole.java
public class PlasmaBankAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new PlasmaBankOfficerWorkAreaPanel(userProcessContainer,account,(PlasmaBankOrganization) organization,enterprise,business,network) ;//To change body of generated methods, choose Tools | Templates.
=======
public class HospitalCoordinatorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new HospitalCoordinatorWorkAreaPanel(userProcessContainer,(HospitalCoordinatorOrganization)organization, enterprise,account,  business, network);
>>>>>>> dev-namitam:src/Business/Role/HospitalCoordinatorRole.java
    }

    
}
