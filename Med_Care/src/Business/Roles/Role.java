/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NurseRole.NurseWorkAreaJPanel;

/*
 * @author jayanthadithya
 */

public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("LabAssistant"),
        Nurse("Nurse"),
        EmgAdmin("EmgAdmin"),
        EmgManager("EmgManager"),
        Driver("Driver"),
        EmgNurse("EmgNurse"),
        Manager("Manager"),
        Physicians("Physicians"),
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
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);


    
    
}
