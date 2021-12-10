/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {

    public Component createWorkArea(JPanel container, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, EcoSystem system) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        GovernmentCoordinator("GovernmentCoordinator"),
        LegalOfficer("LegalOfficer"),
        Pathologist("Pathologist"),
        PlasmaBankCoordinator("PlasmaBankCoordinator"),
        SystemCoordinator("SystemCoordinator");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}