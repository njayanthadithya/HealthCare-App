/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ECareOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Emergency.Emergencynurse.EMSNurseWorkAreaJPanel;

/**
 *
 * @author jayanthadithya
 */
public class EmgNurseRole extends Role {
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
            return new EMSNurseWorkAreaJPanel(userProcessContainer, account, (ECareOrganization)organization, enterprise,business);
    }
    
}
