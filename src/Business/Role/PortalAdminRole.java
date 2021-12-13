/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.PortalAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.PathologistOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PortalAdminRole.PortalAdminRoleWorkAreaPanel;

/**
 *
 * @author namita
 */
public class PortalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new PortalAdminRoleWorkAreaPanel(userProcessContainer,account,(PortalAdminOrganization) organization,enterprise,business,network) ;//To change body of generated methods, choose Tools | Templates.
    }
    
}
