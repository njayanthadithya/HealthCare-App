/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.Blood.Bloodgroup;
import Business.Blood.Bloodgrouplist;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Clinicianorganization;
import Business.Organization.Organization;
import Business.UserAccount.Useraccount;
import javax.swing.JPanel;
import userinterface.Bloodbank.Clinicianworkareapanel;


/**
 *
 * @author Lokesh Balaji
 */
public class ClinicianRole extends Role{


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Useraccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new Clinicianworkareapanel(userProcessContainer, account, (Clinicianorganization)organization, enterprise, business);
                
    }

  
}
