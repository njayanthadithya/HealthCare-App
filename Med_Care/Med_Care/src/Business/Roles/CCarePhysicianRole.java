/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.BloodGroup.BloodGroup;
import Business.BloodGroup.Bloodgrouplist;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CCarePhysicianOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CovidCare.CovidPhysicianWorkArea;


/**
 *
 * @author jayanthadithya
 */
public class CCarePhysicianRole extends Role{


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CovidPhysicianWorkArea(userProcessContainer, account, (CCarePhysicianOrganization)organization, enterprise, business);
                
    }

  
}
