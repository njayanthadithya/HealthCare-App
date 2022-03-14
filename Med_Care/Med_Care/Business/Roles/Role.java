/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Nurseorganization;
import Business.Organization.Organization;
import Business.UserAccount.Useraccount;
import javax.swing.JPanel;
import userinterface.NurseRole.NurseWorkAreaJPanel;

/**
 *
 * @author Lokesh Balaji
 */

public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Nurse("Nurse"),
        EMSAdmin("EMSAdmin"),
        EMSManager("EMSManager"),
        Driver("Driver"),
        EMSNurse("EMSNurse"),
        Manager("Manager"),
        Clinicians("Clinicians"),
        Donor("Donor");

        
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
            Useraccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
