/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.AuthorizationOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AuthorizationOfficerRole.AuthorizationWorkAreaPanel;
import ui.PathologistRole.PathologistWorkAreaPanel;

/**
 *
 * @author namita
 */
public class AuthorizationOfficerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new AuthorizationWorkAreaPanel(account,(AuthorizationOrganization) organization,enterprise,business,network) ;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
