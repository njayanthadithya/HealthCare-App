/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.DriverRole;
import Business.Roles.EmgManagerRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Rutvi Patel
 */
public class ECareManagerOganization extends Organization{
    
        public ECareManagerOganization()
    {
        super(Organization.Type.EmgCareManager.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> Role = new ArrayList<>();
    Role.add(new EmgManagerRole());
        return Role;
    }  
    
}
