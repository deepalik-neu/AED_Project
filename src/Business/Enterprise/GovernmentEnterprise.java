/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author namita
 */
public class GovernmentEnterprise extends Enterprise {
    
    public GovernmentEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Government);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}