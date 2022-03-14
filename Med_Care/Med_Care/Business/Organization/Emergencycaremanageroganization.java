/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.DriverRole;
import Business.Roles.EMSManagerRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author monishmm
 */
public class Emergencycaremanageroganization extends Organization{
    
        public Emergencycaremanageroganization()
    {
        super(Organization.Type.EmergencycareManager.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList<>();
    role.add(new EMSManagerRole());
        return role;
    }  
    
}
