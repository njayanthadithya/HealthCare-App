/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.DriverRole;
import Business.Roles.EmgManagerRole;
import Business.Roles.EmgNurseRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Rutvi Patel
 */
public class ECareOrganization extends Organization{
    
        public ECareOrganization()
    {
        super(Organization.Type.EmgCareNurse.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> Role = new ArrayList<>();
        Role.add(new EmgNurseRole());
        return Role;
    }  
    
}
