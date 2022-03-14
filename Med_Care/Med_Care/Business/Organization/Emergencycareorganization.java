/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.DriverRole;
import Business.Roles.EMSManagerRole;
import Business.Roles.EMSNurseRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author monishmm
 */
public class Emergencycareorganization extends Organization{
    
        public Emergencycareorganization()
    {
        super(Organization.Type.EmergencycareNurse.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EMSNurseRole());
        return roles;
    }  
    
}
