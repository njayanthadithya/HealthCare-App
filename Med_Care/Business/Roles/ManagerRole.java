/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Managerorganization;
import Business.Organization.Organization;
import Business.UserAccount.Useraccount;
import javax.swing.JPanel;
import userinterface.Bloodbank.Managerroleworkareapanel;


/**
 *
 * @author Lokesh Balaji
 */
public class ManagerRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Useraccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new Managerroleworkareapanel(userProcessContainer, account, (Managerorganization)organization, enterprise,business);
    }
    
}
