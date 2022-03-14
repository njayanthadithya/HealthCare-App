/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DriverOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Emergency.Emergencydriver.DriverWorkAreaJPanel;

/**
 *
 * @author jayanthadithya
 */
public class DriverRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DriverWorkAreaJPanel(userProcessContainer, account, (DriverOrganization)organization, enterprise, business);
    }

    
}
 