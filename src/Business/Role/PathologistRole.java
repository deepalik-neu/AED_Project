/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PathologistOrganization;
import Business.UserAccount.UserAccount;
import ui.PathologistRole.PathologistWorkAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class PathologistRole extends Role {


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new PathologistWorkAreaPanel(userProcessContainer,account,(PathologistOrganization) organization,enterprise,business,network) ;//To change body of generated methods, choose Tools | Templates.
    }


    
}
