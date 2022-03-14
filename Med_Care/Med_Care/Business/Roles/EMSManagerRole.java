/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Emergencycaremanageroganization;
import Business.Organization.Organization;
import Business.UserAccount.Useraccount;
import javax.swing.JPanel;
import userinterface.EMS.EMSManager.Emergencymanagerpanel;

/**
 *
 * @author Lokesh Balaji
 */
public class EMSManagerRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Useraccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new Emergencymanagerpanel(userProcessContainer, organization, enterprise, account);
    }
    
}
